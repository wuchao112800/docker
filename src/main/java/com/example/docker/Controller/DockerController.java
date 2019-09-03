package com.example.docker.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerController {
    @RequestMapping("/hello")
    public String hello() {
        //git dev 0000
        //order
        //encount
        return "<h1>Hello Docker 2019/09/02</h1>";
    }
}
