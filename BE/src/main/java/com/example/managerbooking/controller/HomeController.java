package com.example.managerbooking.controller;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/home")
@CrossOrigin("*")
public class HomeController {

    @PostMapping(value = "/success")
    public String token(Authentication authentication) {
        return "Success";
    }


}
