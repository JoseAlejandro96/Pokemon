package com.star.project.pokemon.api

import com.star.project.pokemon.models.PokemonResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface PokeApiService {

    @GET("pokemon")
    suspend fun getPokemonList(@Query("limit") limit : Int , @Query("offset")offset: Int): Response<PokemonResponse>
}