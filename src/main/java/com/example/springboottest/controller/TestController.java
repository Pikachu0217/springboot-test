package com.example.springboottest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Classname TestController
 * @Date 2023/10/27 12:09 AM
 * @Created by pakachuzy
 * @Description TODO
 */
@RestController
public class TestController {
    @GetMapping("/test")
    public String test() {
        return "Hello World";
    }
}
