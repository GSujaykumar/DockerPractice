package com.example.dockerpractice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class DockerController {

    @GetMapping("/dockerPractice")
    public String dockerPractice(){
        return  "Docker is Running";
    }

}

