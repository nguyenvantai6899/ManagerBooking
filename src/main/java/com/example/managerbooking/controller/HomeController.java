package com.example.managerbooking.controller;

import com.example.managerbooking.service.TokenService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;


@RestController
public class HomeController {
    private static final Logger LOG =  LoggerFactory.getLogger(HomeController.class);

    private final TokenService tokenService;


    public HomeController(TokenService tokenService) {
        this.tokenService = tokenService;
    }

    @PostMapping("/token")
    public String token(Authentication authentication) {
        LOG.debug("Token requested for user: '{}'", authentication.getName());
        String token = tokenService.generateToken(authentication);
        LOG.debug("Token granted: {}", token);
        return token;
    }
    @GetMapping
    public String home(Principal principal) {
        return "Hello, " + principal.getName();
    }

}
