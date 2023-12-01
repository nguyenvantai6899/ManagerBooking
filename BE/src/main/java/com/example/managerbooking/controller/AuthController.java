package com.example.managerbooking.controller;

import com.example.managerbooking.entity.User;
import com.example.managerbooking.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/auth")
@CrossOrigin("*")
public class AuthController {
    @Autowired
    private AuthService authService;

    @PostMapping(value = "/register", consumes = "application/json")
    public ResponseEntity<Object> register(@RequestBody User user) {
        return authService.registerUser(user);
    }

    @PostMapping(value = "/login")
    public ResponseEntity<Object> login(@RequestParam ("email") String email , @RequestParam ("password") String password) {
        return authService.loginUser(email, password);
    }

}
