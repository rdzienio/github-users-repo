package pl.sda.service;

import org.springframework.stereotype.Service;
import pl.sda.domain.UserRepository;
import pl.sda.repository.GithubRepository;

@Service
public class GithubService {

    private final GithubRepository repository;

    public GithubService(final GithubRepository repository) {
        this.repository = repository;
    }

    public UserRepository[] getGithubRepositories(){
        return repository.readUserRepositoryFromGithub();
    }
}
