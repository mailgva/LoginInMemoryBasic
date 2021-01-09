package com.gorbatenko.loginbasic.controller;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {
    @GetMapping("/")
    public Authentication root(Authentication authentication) {
        return authentication;
    }

}