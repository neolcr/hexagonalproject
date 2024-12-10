package com.example.hexagonalproject.presentation.resource

import com.example.hexagonalproject.application.dto.KotlinExampleRequestDTO
import com.example.hexagonalproject.application.dto.KotlinExampleResponseDTO
import com.example.hexagonalproject.application.mapper.KotlinExampleMapper
import com.example.hexagonalproject.application.service.KotlinExampleUseCase
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import org.slf4j.LoggerFactory


@RestController
@RequestMapping("/kotlin/example")
class KotlinExampleResource(
    val resource: KotlinExampleUseCase
) {

    private val logger = LoggerFactory.getLogger(KotlinExampleResource::class.java)

    @GetMapping("/{id}")
    fun getExample(@PathVariable("id") id: Long): ResponseEntity<KotlinExampleResponseDTO> {
        val response = resource.get(id)
        return ResponseEntity.ok(response)
    }

    @GetMapping("/all")
    fun getExample(): ResponseEntity<List<KotlinExampleResponseDTO>> {
        val response = resource.getAll()
        return ResponseEntity.ok(response)
    }

    @PostMapping("/add")
    fun addExample(@RequestBody(required = true) body: KotlinExampleRequestDTO) : ResponseEntity<KotlinExampleResponseDTO>{
        logger.info("This is the something $body")
        val response = resource.add(body)
        return ResponseEntity.ok(response)
    }
}
