package com.example.hexagonalproject.application.service

import com.example.hexagonalproject.application.dto.KotlinExampleRequestDTO
import com.example.hexagonalproject.application.dto.KotlinExampleResponseDTO
import com.example.hexagonalproject.application.mapper.KotlinExampleMapper
import com.example.hexagonalproject.domain.model.KotlinExampleDomain
import com.example.hexagonalproject.infrastructure.adapter.persistence.KotlinExampleRepository
import org.springframework.stereotype.Service

@Service
class KotlinExampleUseCase(val repository: KotlinExampleRepository, val mapper: KotlinExampleMapper,) {

    fun get(id: Long): KotlinExampleResponseDTO {
        return mapper.toDTO(repository.getReferenceById(id))
    }

    fun getAll(): List<KotlinExampleResponseDTO> {
        val all = repository.findAll()
        val map: List<KotlinExampleResponseDTO> = all.map(mapper::toDTO)
        return map
    }

    fun add(request: KotlinExampleRequestDTO): KotlinExampleResponseDTO {
        return mapper.toDTO(repository.save(mapper.toDomain(request)))
    }
}