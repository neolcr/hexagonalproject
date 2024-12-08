package com.example.hexagonalproject.presentation.resource

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/kotlin/example")
class KotlinExampleResource {
    @GetMapping("/{id}")
    fun getExample(@PathVariable("id") id: Long?): ResponseEntity<String> {
        return ResponseEntity.ok("This was ok $id \n")
    }
}
