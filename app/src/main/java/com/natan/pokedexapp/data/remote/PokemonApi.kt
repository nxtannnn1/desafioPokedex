package com.natan.pokedexapp.data.remote

import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface PokemonApi {

    @GET("pokemon")
    suspend fun getPokemons(
        @Query("limit") limit: Int,
        @Query("offset") offset: Int
    ): PokemonApiResponseDTO

    @GET("pokemon/{id}")
    suspend fun getPokemonById(
        @Path("id") id: Long
    ): PokemonDTOResult

    @GET("pokemon/{name}")
    suspend fun getPokemonByName(
        @Path("name") name: String
    ): PokemonDTOResult
}
