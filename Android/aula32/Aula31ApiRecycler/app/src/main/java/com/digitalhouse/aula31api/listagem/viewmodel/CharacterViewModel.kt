package com.digitalhouse.aula31api.listagem.viewmodel

import androidx.lifecycle.MutableLiveData
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

    val characters = MutableLiveData<List<CharacterModel>>()

    fun obterLista() {
        repository.obterLista(object : OnResult<ApiResponseModel<CharacterModel>> {
            override fun onSucess(result: ApiResponseModel<CharacterModel>) {
                characters.value = result.results
            }

            override fun onFailure() {
                TODO("Not yet implemented")
            }

        })

    }
}