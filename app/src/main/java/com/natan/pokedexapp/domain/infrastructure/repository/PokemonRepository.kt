package com.natan.pokedexapp.domain.infrastructure.repository

import com.natan.pokedexapp.domain.enums.ELEMENT
import com.natan.pokedexapp.domain.model.Pokemon

interface PokemonRepository {

    suspend fun findById(id: Long): Pokemon?
    suspend fun findAll(): List<Pokemon>
    suspend fun findByName(name: String): Pokemon?
    suspend fun findByElement(element: ELEMENT): List<Pokemon>
}