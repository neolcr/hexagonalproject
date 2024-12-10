package com.example.hexagonalproject.application.mapper;

import com.example.hexagonalproject.application.dto.KotlinExampleRequestDTO
import com.example.hexagonalproject.application.dto.KotlinExampleResponseDTO
import com.example.hexagonalproject.domain.model.KotlinExampleDomain
import org.springframework.stereotype.Component

@Component
class KotlinExampleImplMapper: KotlinExampleMapper {
    override fun toDTO(domain: KotlinExampleDomain): KotlinExampleResponseDTO {
        val dto = KotlinExampleResponseDTO(domain.id, domain.desc)
        return dto
    }

    override fun toDomain(dto: KotlinExampleRequestDTO): KotlinExampleDomain {
        val domain = KotlinExampleDomain(dto.id, dto.desc)
        return domain
    }

}
