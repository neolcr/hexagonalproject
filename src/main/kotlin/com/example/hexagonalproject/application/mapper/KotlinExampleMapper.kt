package com.example.hexagonalproject.application.mapper;

import com.example.hexagonalproject.application.dto.KotlinExampleRequestDTO
import com.example.hexagonalproject.application.dto.KotlinExampleResponseDTO;
import com.example.hexagonalproject.domain.model.KotlinExampleDomain

interface KotlinExampleMapper {
    fun toDTO (domain: KotlinExampleDomain) : KotlinExampleResponseDTO
    fun toDomain(dto : KotlinExampleRequestDTO): KotlinExampleDomain
}
