package com.digitalhouse.rickapp.api

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query
import kotlin.random.Random

interface Endpoint {

    @GET("character")
    fun getPersonagens(): Call<Resultado>
}