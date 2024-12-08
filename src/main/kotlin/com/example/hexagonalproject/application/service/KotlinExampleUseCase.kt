package com.example.hexagonalproject.application.service

import com.example.hexagonalproject.domain.model.KotlinExampleResponseDomain
import org.springframework.stereotype.Service

@Service
class KotlinExampleUseCase {

    fun get(id: Long): KotlinExampleResponseDomain {
        val result = KotlinExampleResponseDomain(id = id, desc = "Esto es la descripcion")
        return result
    }
}