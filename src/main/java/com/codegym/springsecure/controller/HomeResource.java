package com.codegym.springsecure.controller;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeResource {

    @GetMapping("/")
    public String home(){
        return "<h1>Welcome</h1>";
    }
    @GetMapping("/user")
    public String user(){
        String userName;
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        if (principal instanceof UserDetails) {
            userName = ((UserDetails)principal).getUsername();
        } else {
            userName = principal.toString();
        }
        return "<h1>Welcome "+userName+"</h1>";
    }
    @GetMapping("/admin")
    public String admin(){
        return "<h1>Welcome Admin</h1>";
    }

}
