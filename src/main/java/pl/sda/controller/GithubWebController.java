package pl.sda.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import pl.sda.service.GithubService;

@Controller
public class GithubWebController {

    private final GithubService service;

    public GithubWebController(final GithubService service) {
        this.service = service;
    }

    @GetMapping(path = "/*")
    public String getGithubRepositories(){
        return "index";
    }
}
