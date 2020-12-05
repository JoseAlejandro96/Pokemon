package com.star.project.pokemon.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.star.project.pokemon.R
import com.star.project.pokemon.databinding.ActivityMainBinding
import com.star.project.pokemon.repository.PokemonRepository
import com.star.project.pokemon.ui.viewmodels.PokemonViewModel
import com.star.project.pokemon.ui.viewmodels.PokemonViewModelProviderFactory

class MainActivity : AppCompatActivity() {

    private lateinit var _binding: ActivityMainBinding
    private val binding get() = _binding

    lateinit var viewModel: PokemonViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val pokemonRepository = PokemonRepository()
        val viewModelProviderFactory = PokemonViewModelProviderFactory(application, pokemonRepository)
        viewModel = ViewModelProvider(this, viewModelProviderFactory).get(PokemonViewModel::class.java)
    }
}