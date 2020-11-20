package com.digitalhouse.aula31api.listagem.models

import com.google.gson.annotations.SerializedName

data class CharacterModel(
    val id: Int,
    @SerializedName("name")
    val nome: String,
    val status: String,
    @SerializedName("origin")
    val origem: OriginModel,
    @SerializedName("image")
    val imagem: String,
    @SerializedName("episodes")
    val episodios: List<String>
)
