package com.mladmin.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class UserLoginController {
	@GetMapping
    public String hello() {
        return "Welcome ML-LOG Admin Portal";
    }

}
