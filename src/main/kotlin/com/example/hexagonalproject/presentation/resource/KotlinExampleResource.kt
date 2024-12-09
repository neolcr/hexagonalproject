package com.example.hexagonalproject.presentation.resource

import com.example.hexagonalproject.application.dto.KotlinExampleRequestDTO
import com.example.hexagonalproject.application.dto.KotlinExampleResponseDTO
import com.example.hexagonalproject.application.mapper.KotlinExampleResponseMapper
import com.example.hexagonalproject.application.service.KotlinExampleUseCase
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import org.slf4j.LoggerFactory


@RestController
@RequestMapping("/kotlin/example")
class KotlinExampleResource(
    val mapper: KotlinExampleResponseMapper,
    val resource: KotlinExampleUseCase
) {

    private val logger = LoggerFactory.getLogger(KotlinExampleResource::class.java)

    @GetMapping("/{id}")
    fun getExample(@PathVariable("id") id: Long): ResponseEntity<KotlinExampleResponseDTO> {
        val dto = mapper.toDTO(resource.get(id))
        return ResponseEntity.ok(dto)
    }

    @PostMapping("/add")
    fun addExample(@RequestBody(required = true) body: KotlinExampleRequestDTO) : ResponseEntity<KotlinExampleResponseDTO>{
        logger.info("This is the something $body")
        val id = body.id
        val response = mapper.toDTO(resource.get(id))
        return ResponseEntity.ok(response)
    }
}
