package com.natan.pokedexapp.data.repository

import com.natan.pokedexapp.data.remote.dto.PokemonApiResponseDTO
import com.natan.pokedexapp.data.remote.mapper.PokemonMapper
import com.natan.pokedexapp.domain.enums.ELEMENT
import com.natan.pokedexapp.domain.infrastructure.repository.PokemonRepository
import com.natan.pokedexapp.domain.model.Pokemon

class PokemonRepositoryImplementation(
    private val api: PokemonApiResponseDTO,
    private val mapper: PokemonMapper
) : PokemonRepository {

    override suspend fun findById(id: Long): Pokemon? {
        return mapper.fromDTO(api.getPokemonById(id))
    }

    override suspend fun findAll(): List<Pokemon> {
        val response = api.getPokemons(limit = 10000, offset = 0)
        return mapper.fromDTOList(response.results)
    }

    override suspend fun findByName(name: String): Pokemon? {
        return mapper.fromDTO(api.getPokemonByName(name))
    }

    override suspend fun findByElement(element: ELEMENT): List<Pokemon> {
        // Aqui você pode chamar o endpoint /type/{element}
        return emptyList()
    }
}
