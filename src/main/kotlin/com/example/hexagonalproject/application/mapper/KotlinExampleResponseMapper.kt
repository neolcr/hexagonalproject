package com.example.hexagonalproject.application.mapper;

import com.example.hexagonalproject.application.dto.KotlinExampleResponseDTO;
import com.example.hexagonalproject.domain.model.KotlinExampleResponseDomain

interface KotlinExampleResponseMapper {
    fun toDTO (domain: KotlinExampleResponseDomain) : KotlinExampleResponseDTO
}
