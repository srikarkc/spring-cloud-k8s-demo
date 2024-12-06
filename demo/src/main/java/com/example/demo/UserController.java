package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserController {

    @Value("${app.message}")
    private String appMessage;

    @Value("${DB_PASSWORD:unknown}")
    private String dbPassword;

    @GetMapping("/welcome")
    public ResponseEntity<String> welcome() {
        return ResponseEntity.ok(appMessage);
    }

    @GetMapping("/db-password")
    public ResponseEntity<String> dbPassword() {
        return ResponseEntity.ok("Database Password: " + dbPassword);
    }
}

