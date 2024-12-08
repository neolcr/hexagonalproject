package com.example.hexagonalproject.presentation.resource;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/java/example")
public class JavaExampleResource {

    @GetMapping("/{id}")
    public ResponseEntity<String> getExample(@PathVariable("id") Long id) {
        return ResponseEntity.ok("This was ok \n");
    }
}
