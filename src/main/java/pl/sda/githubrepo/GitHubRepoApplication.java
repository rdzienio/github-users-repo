package pl.sda.githubrepo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "pl.sda")
public class GitHubRepoApplication {

    public static void main(String[] args) {
        SpringApplication.run(GitHubRepoApplication.class, args);
    }

}
