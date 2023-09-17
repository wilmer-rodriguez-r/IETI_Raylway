package com.example.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class HelloController {

    @GetMapping("/hello")
    public ResponseEntity<?> helloGet() {
        return ResponseEntity.ok("Hola Wilmer");
    }
}
