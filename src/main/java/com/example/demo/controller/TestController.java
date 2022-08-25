package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TestController {
    @GetMapping("/")
    public String mainPage() {
        return "/template/home";
    }
    @GetMapping("/auth/login")
    public String loginForm() {
        return "/template/auth/login";
    }
    @PostMapping("/auth/login")
    public String login(){
        return "/template/home";
    }

}