package com.digitalhouse.rickapp

import com.digitalhouse.rickapp.api.Localizacao

data class Personagem(
    val nome: String,
    val status: String,
    val especie: String,
    val genero: String,
    val imagemUrl: String,
    val localizacao: Localizacao
) {
}