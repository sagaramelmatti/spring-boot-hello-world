package com.example.helloWorld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * This controller handles greetings.
 */
@RestController
@RequestMapping("/api/hello")
public class HelloController {

    /**
     * Returns a greeting message.
     *
     * @return A "Hello World!" message.
     */
    @GetMapping("/")
    public String sayHello() {
        return "Hello World!";
    }
}
