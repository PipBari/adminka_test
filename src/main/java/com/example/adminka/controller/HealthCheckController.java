package com.example.adminka.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class HealthCheckController {

    @GetMapping("/health")
    public String checkHealth() {
        return "OK";
    }
}
