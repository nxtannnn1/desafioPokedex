package com.natan.pokedexapp.data.remote.mapper

import com.natan.pokedexapp.data.remote.dto.PokemonDTOResult
import com.natan.pokedexapp.data.remote.dto.PokemonApiResponseDTO
import com.natan.pokedexapp.domain.enums.ELEMENT
import com.natan.pokedexapp.domain.model.Pokemon

class PokemonMapper {

    fun fromDTO(dto: PokemonDTOResult): Pokemon {
        return Pokemon(
            id=null,
            name=dto.name,
            element = ELEMENT.NORMAL,
            url = dto.url
        )
    }

    fun fromDTOList(dtos: List<PokemonDTOResult>): List<Pokemon>{
        return dtos.map {fromDTO(it)}
    }

}