package com.prometheus.grafana.springboot.practice.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greetings")
public class GreetingsController {

    @GetMapping
    public ResponseEntity<String> greetings() {
        return ResponseEntity.ok("Hello Miztli");
    }
}
