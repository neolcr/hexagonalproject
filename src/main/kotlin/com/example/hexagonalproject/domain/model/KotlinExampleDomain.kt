package com.example.hexagonalproject.domain.model

import jakarta.persistence.*

@Entity
@Table(name = "example_domain")
class KotlinExampleDomain {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long = 0

    var desc: String = ""

    constructor() // No-arg constructor required by JPA

    constructor(id: Long, desc: String) {
        this.id = id
        this.desc = desc
    }
}