package com.example.retrofit.model.character

import com.google.gson.annotations.SerializedName

data class CharacterModel(
    var id: Int,
    @SerializedName("name")
    val nome: String,
    val status: String,
    @SerializedName("origin")
    val origem: OriginModel,
    @SerializedName("episode")
    val episodios: List<String>
)
