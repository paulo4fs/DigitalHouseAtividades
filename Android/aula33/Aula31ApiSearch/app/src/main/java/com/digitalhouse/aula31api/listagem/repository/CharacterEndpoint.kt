package com.digitalhouse.aula31api.listagem.repository

import com.digitalhouse.aula31api.data.model.ApiResponseModel
import com.digitalhouse.aula31api.listagem.models.CharacterModel
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface CharacterEndpoint {
    @GET("character")
    fun obterLista(): Call<ApiResponseModel<CharacterModel>>

    @GET("character/{id}")
    fun obterDetalhe(@Path("id") id: Int): Call<CharacterModel>
}