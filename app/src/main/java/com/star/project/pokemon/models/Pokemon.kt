package com.star.project.pokemon.models

data class Pokemon(
    val name: String,
    val url: String
){

    val number:Int
        get() {
            val urlParts = url.split("/")
            return  urlParts[urlParts.size - 2].toInt()
        }
}