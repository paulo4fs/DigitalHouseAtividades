package com.example.retrofit.model.location

import com.google.gson.annotations.SerializedName

data class LocationModel(
    var id: Int,
    @SerializedName("name")
    var nome: String,
    @SerializedName("type")
    var tipo: String,
    @SerializedName("dimension")
    var dimensao: String,
    @SerializedName("residents")
    var residentes: List<String>
)
