package pl.sda.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pl.sda.service.GithubService;

@Controller
public class GithubWebController {

    private static final String ALL_GITHUB_REPOS = "githubRepos";
    private static final String USER_NAME = "userName";

    private final GithubService service;
    private final String githubUser;

    public GithubWebController(final GithubService service, @Value("${github.user}") final String githubUser) {
        this.service = service;
        this.githubUser = githubUser;
    }

    @GetMapping(path = {"index","/*"})
    public String getGithubRepositories(Model model){
        model.addAttribute(USER_NAME, githubUser);
        model.addAttribute(ALL_GITHUB_REPOS, service.getGithubRepositories());
        return "index";
    }
}
