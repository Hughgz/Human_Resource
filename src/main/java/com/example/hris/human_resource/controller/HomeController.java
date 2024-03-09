package com.example.hris.human_resource.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/home")
    public String getMyHomePage(){
        return "homepage/homepage.html";
    }
}
