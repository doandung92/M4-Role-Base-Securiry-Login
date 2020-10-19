package com.codegym.springsecure.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/Access_Denied")
    public String accessDenied(){
        return "accessDenied";
    }
}
