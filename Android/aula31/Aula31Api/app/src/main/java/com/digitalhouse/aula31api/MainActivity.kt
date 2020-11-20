package com.digitalhouse.aula31api

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.digitalhouse.aula31api.listagem.view.ListFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment, ListFragment())
            .commit()

        // Fins de testes
//        httpClient = NetworkUtils.getRetrofitInstance(BASE_URL)
//        obterPersonagens()
//        obterPlanetas()
    }
/*
    fun obterPersonagens() {
        val endpoint = httpClient.create(CharacterEndpoint::class.java)

        endpoint.obterPersonagens().enqueue(object : Callback<ApiResponseModel<CharacterModel>> {
            override fun onResponse(
                call: Call<ApiResponseModel<CharacterModel>>,
                response: Response<ApiResponseModel<CharacterModel>>
            ) {
                val resultado = response.body()

                Toast.makeText(this@MainActivity, resultado!!.results[0].nome, Toast.LENGTH_LONG)
                    .show()
            }

            override fun onFailure(call: Call<ApiResponseModel<CharacterModel>>, t: Throwable) {
            }
        })
    }

    fun obterPlanetas() {
        val endpoint = httpClient.create(LocationEndpoint::class.java)

        endpoint.obterPlanetas().enqueue(object : Callback<ApiResponseModel<LocationModel>> {
            override fun onResponse(
                call: Call<ApiResponseModel<LocationModel>>,
                response: Response<ApiResponseModel<LocationModel>>
            ) {
                val resultado = response.body()

                Toast.makeText(this@MainActivity, resultado!!.results[0].nome, Toast.LENGTH_LONG)
                    .show()
            }

            override fun onFailure(call: Call<ApiResponseModel<LocationModel>>, t: Throwable) {
            }
        })
    }

    companion object {
        const val BASE_URL = "https://rickandmortyapi.com/api/"
        lateinit var httpClient: Retrofit
    }*/
}



