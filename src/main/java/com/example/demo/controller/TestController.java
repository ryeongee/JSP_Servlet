package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {
    @GetMapping("/")
    public String mainPage() {
        return "/template/home";
    }
    @GetMapping("/auth/login")
    public String login() {
        System.out.println("get 받음");
        return "/template/auth/login";
    }
}