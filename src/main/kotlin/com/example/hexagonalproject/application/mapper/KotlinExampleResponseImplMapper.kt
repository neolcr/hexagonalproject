package com.example.hexagonalproject.application.mapper;

import com.example.hexagonalproject.application.dto.KotlinExampleResponseDTO
import com.example.hexagonalproject.domain.model.KotlinExampleResponseDomain
import org.springframework.stereotype.Component

@Component
class KotlinExampleResponseImplMapper: KotlinExampleResponseMapper {
    override fun toDTO(domain: KotlinExampleResponseDomain): KotlinExampleResponseDTO {
        val dto = KotlinExampleResponseDTO(domain.id, domain.desc)
        return dto
    }
}
