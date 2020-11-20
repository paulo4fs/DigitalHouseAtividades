package com.digitalhouse.rickapp.api

import com.digitalhouse.rickapp.listapersonagem.model.Personagem

interface IRespostaDaApi {
    fun obtevePersonagens(personagens: List<Personagem>)
}