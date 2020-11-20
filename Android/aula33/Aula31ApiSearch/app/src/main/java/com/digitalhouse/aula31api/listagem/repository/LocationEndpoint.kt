package com.digitalhouse.aula31api.listagem.repository

import com.digitalhouse.aula31api.data.model.ApiResponseModel
import com.digitalhouse.aula31api.listagem.models.LocationModel
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface LocationEndpoint {
    @GET("location")
    fun obterPlanetas(): Call<ApiResponseModel<LocationModel>>

    @GET("location/{id}")
    fun obterDetalhe(@Path("id") id: Int): Call<LocationModel>
}