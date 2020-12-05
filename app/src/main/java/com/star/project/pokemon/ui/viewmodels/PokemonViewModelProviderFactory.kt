package com.star.project.pokemon.ui.viewmodels

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.star.project.pokemon.repository.PokemonRepository

class PokemonViewModelProviderFactory(
    val app: Application,
    val pokemonRepository: PokemonRepository
) : ViewModelProvider.Factory{
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return PokemonViewModel(app, pokemonRepository) as T
    }

}