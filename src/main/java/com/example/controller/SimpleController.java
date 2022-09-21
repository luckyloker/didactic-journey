package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {

    @GetMapping("/hello")
    public String helloEndpoint() {
        return "Hello from cloud";
    }

    @GetMapping("/whothebest")
    public String whothebest() {
        return "Tanya - THE BEST!";
    }

}
