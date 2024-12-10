package com.example.hexagonalproject.infrastructure.adapter.persistence

import com.example.hexagonalproject.domain.model.KotlinExampleDomain
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface KotlinExampleRepository: JpaRepository<KotlinExampleDomain, Long> {
}