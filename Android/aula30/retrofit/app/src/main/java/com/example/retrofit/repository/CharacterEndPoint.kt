package com.example.retrofit.repository

import com.example.retrofit.model.character.CharacterModel
import com.example.retrofit.model.generic.ApiResponseModel
import com.example.retrofit.model.location.LocationModel
import retrofit2.Call
import retrofit2.Callback
import retrofit2.http.GET
import retrofit2.http.Path

interface CharacterEndPoint {
    //    get all characters
    @GET("character")
    fun obterPersonagens(): Call<ApiResponseModel<CharacterModel>>

    //    get one character
    @GET("character/{id}")
    fun obterDetalhe(@Path("id") id: Int): Call<CharacterModel>

    //    get all locations
    @GET("location")
    fun obterLocalizacoes(): Call<ApiResponseModel<LocationModel>>
}