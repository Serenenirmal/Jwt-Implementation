package com.jwt.example.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class HomeController {

    //http://localhost:8081/home/users
    @GetMapping("/users")
    public String getUser(){
        System.out.println("getting users");

        return "Users";
    }

}
