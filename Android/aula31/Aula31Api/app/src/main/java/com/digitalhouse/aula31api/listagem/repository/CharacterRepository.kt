package com.digitalhouse.aula31api.listagem.repository

import com.digitalhouse.aula31api.data.api.NetworkUtils
import com.digitalhouse.aula31api.data.api.OnResult
import com.digitalhouse.aula31api.data.model.ApiResponseModel
import com.digitalhouse.aula31api.listagem.models.CharacterModel
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.create

class CharacterRepository {
    fun obterLista(onResult: OnResult<ApiResponseModel<CharacterModel>>) {
        val client = NetworkUtils.getRetrofitInstance()
        val api = client.create(CharacterEndpoint::class.java)

        api.obterPersonagens().enqueue(object : Callback<ApiResponseModel<CharacterModel>> {
            override fun onResponse(
                call: Call<ApiResponseModel<CharacterModel>>,
                response: Response<ApiResponseModel<CharacterModel>>
            ) {
                onResult.onSucess(response.body()!!)
            }

            override fun onFailure(call: Call<ApiResponseModel<CharacterModel>>, t: Throwable) {
                TODO("Not yet implemented")
            }

        })

    }
}