package pl.sda.repository;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;
import pl.sda.domain.UserRepository;

import java.util.Map;

@Repository
@Slf4j
public class GithubRepository {

    private final static String CONNECTION_URL = "https://api.github.com/users/{user}/repos";

    private final RestTemplate restTemplate;
    private final String githubUser;

    public GithubRepository(final RestTemplate restTemplate, @Value("${github.user}") final String githubUser) {
        this.restTemplate = restTemplate;
        this.githubUser = githubUser;
    }

    public UserRepository[] readUserRepositoryFromGithub(){
        UserRepository[] result = restTemplate.getForObject(CONNECTION_URL, UserRepository[].class, Map.of("user", githubUser));
        log.info("Received repos for user [{}]: [{}]", githubUser, result);
        return result;
    }
}

