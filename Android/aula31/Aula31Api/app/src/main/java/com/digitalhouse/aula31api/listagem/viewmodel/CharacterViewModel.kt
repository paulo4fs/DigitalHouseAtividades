package com.digitalhouse.aula31api.listagem.viewmodel

import android.widget.Toast
import androidx.lifecycle.ViewModel
import com.digitalhouse.aula31api.data.api.NetworkUtils
import com.digitalhouse.aula31api.data.api.OnResult
import com.digitalhouse.aula31api.data.model.ApiResponseModel
import com.digitalhouse.aula31api.listagem.models.CharacterModel
import com.digitalhouse.aula31api.listagem.repository.CharacterEndpoint
import com.digitalhouse.aula31api.listagem.repository.CharacterRepository
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class CharacterViewModel(
    private val repository: CharacterRepository
) : ViewModel() {
    fun obterPersonagens() {
        repository.obterLista(object : OnResult<List<CharacterModel>> {
            override fun onSucess(result: List<CharacterModel>) {
                NetworkUtils.getRetrofitInstance()
            }

            override fun onFailure() {
                TODO("Not yet implemented")
            }

        })

    }
}