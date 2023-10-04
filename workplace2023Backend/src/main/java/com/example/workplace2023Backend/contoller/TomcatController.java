package com.example.workplace2023Backend.contoller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TomcatController {
    @GetMapping("/apache")
    public String apache()
    {
        return "Apache Tomcat.";
    }
}

