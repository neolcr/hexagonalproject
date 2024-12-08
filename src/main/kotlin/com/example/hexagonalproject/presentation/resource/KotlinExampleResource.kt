package com.example.hexagonalproject.presentation.resource

import com.example.hexagonalproject.application.dto.KotlinExampleResponseDTO
import com.example.hexagonalproject.application.mapper.KotlinExampleResponseMapper
import com.example.hexagonalproject.application.service.KotlinExampleUseCase
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/kotlin/example")
class KotlinExampleResource(
    val mapper: KotlinExampleResponseMapper,
    val resource: KotlinExampleUseCase
) {

    @GetMapping("/{id}")
    fun getExample(@PathVariable("id") id: Long): ResponseEntity<KotlinExampleResponseDTO> {
        val dto = mapper.toDTO(resource.get(id))
        return ResponseEntity.ok(dto)
    }
}
