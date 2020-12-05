package com.star.project.pokemon.repository

import com.star.project.pokemon.api.RetrofitInstance
import com.star.project.pokemon.utils.Constants.Companion.MAX_POKEMONS_LOADED

class PokemonRepository {

    suspend fun getPokemonList(offset: Int) = RetrofitInstance.api.getPokemonList(MAX_POKEMONS_LOADED, offset)
}