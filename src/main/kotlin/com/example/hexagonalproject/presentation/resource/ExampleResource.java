package com.example.hexagonalproject.presentation.resource;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/example")
public class ExampleResource {

    @GetMapping
    public ResponseEntity<String> getExample() {
        return ResponseEntity.ok("This was ok\n");
    }
}
