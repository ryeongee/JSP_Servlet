package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping
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
    public String login(BindingResult bindingResult) {
        System.out.println("========adsfsdf");
        return "/";
    }
}