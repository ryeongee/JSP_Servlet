package com.example.demo.test.com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {
    @GetMapping("/insert/insert")
    public String indexForm() {
        System.out.println("get 받음");
        return "/insert/insert";
    }
}