package pl.sda.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.sda.domain.UserRepository;
import pl.sda.service.GithubService;

@RestController
@Slf4j
public class GithubRESTController {

    private final GithubService service;

    public GithubRESTController(final GithubService service) {
        this.service = service;
    }

    @GetMapping(path = {"api", "/api/*"})
    public UserRepository[] getGithubRepositoriesJSON(){
        return service.getGithubRepositories();
    }

}
