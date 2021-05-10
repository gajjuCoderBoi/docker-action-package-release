package com.example.dockeractionpackagerelease;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DockerActionPackageReleaseApplication {

    @GetMapping
    public String greetings(){
        return "Welcome";
    }

    public static void main(String[] args) {
        SpringApplication.run(DockerActionPackageReleaseApplication.class, args);
    }

}
