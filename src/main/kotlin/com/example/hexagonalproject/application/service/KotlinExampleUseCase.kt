package com.example.hexagonalproject.application.service

import com.example.hexagonalproject.domain.model.KotlinExampleResponseDomain
import com.example.hexagonalproject.infrastructure.adapter.persistence.KotlinExampleRepository
import org.springframework.stereotype.Service

@Service
class KotlinExampleUseCase(val repository: KotlinExampleRepository) {

    fun get(id: Long): KotlinExampleResponseDomain {
        val result = KotlinExampleResponseDomain(id = id, desc = "Esto es la descripcion")
        val referenceById = repository.getReferenceById(id)
        result.id = referenceById.id
        result.desc = referenceById.desc
        return result
    }
}