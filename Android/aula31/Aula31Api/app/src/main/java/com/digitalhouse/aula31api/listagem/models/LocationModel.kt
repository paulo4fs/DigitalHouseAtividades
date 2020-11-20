package com.digitalhouse.aula31api.listagem.models

import com.google.gson.annotations.SerializedName

data class LocationModel(
    val id: Int,
    @SerializedName("name")
    val nome: String,
    @SerializedName("type")
    val tipo: String,
    @SerializedName("dimension")
    val dimensao: String,
    @SerializedName("residents")
    val residentes: List<String>
)