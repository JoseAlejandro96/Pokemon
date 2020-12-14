package com.star.project.pokemon.database

import com.star.project.pokemon.models.Pokemon
import com.star.project.pokemon.utils.EntityMapper
import javax.inject.Inject

class CacheMapper
@Inject constructor() : EntityMapper<PokemonCacheEntity, Pokemon>{
    override fun mapFromEntity(entity: PokemonCacheEntity): Pokemon {
        TODO("Not yet implemented")
    }

    override fun mapToEntity(domainModel: Pokemon): PokemonCacheEntity {
        TODO("Not yet implemented")
    }
}