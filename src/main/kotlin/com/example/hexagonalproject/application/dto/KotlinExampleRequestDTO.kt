package com.example.hexagonalproject.application.dto

class KotlinExampleRequestDTO(var id: Long, var desc: String) {
    override fun toString(): String {
        return "KotlinExampleRequestDTO(id=$id, desc='$desc')"
    }
}