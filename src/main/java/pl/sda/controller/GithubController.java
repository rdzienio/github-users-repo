package pl.sda.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.sda.domain.UserRepository;
import pl.sda.service.GithubService;

@RestController("/")
@Slf4j
public class GithubController {

    private final GithubService service;

    public GithubController(final GithubService service) {
        this.service = service;
    }

    @GetMapping
    public UserRepository[] getGithubRepositories(){
        /*HttpHeaders headers = new HttpHeaders();
        headers.add("User-Agent", "rdzienio");*/
        return service.getGithubRepositories();
    }
}
