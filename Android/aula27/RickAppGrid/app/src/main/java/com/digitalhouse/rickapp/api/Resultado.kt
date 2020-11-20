package com.digitalhouse.rickapp.api

import com.digitalhouse.rickapp.listapersonagem.model.Personagem
import com.google.gson.annotations.SerializedName

data class Resultado(
    @SerializedName("results")
    val resultados: List<Personagem>
)