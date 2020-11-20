package com.example.retrofit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.retrofit.model.character.CharacterModel
import com.example.retrofit.model.generic.ApiResponseModel
import com.example.retrofit.repository.CharacterEndPoint
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        httpClient = NetworkUtils.getRetrofitInstance(BASE_URL)
        obterPersonagens()
    }

    fun obterPersonagens() {
        val endpoint = httpClient.create(CharacterEndPoint::class.java)

        endpoint.obterPersonagens().enqueue(object : Callback<ApiResponseModel<CharacterModel>> {
            override fun onResponse(
                call: Call<ApiResponseModel<CharacterModel>>,
                response: Response<ApiResponseModel<CharacterModel>>
            ) {
                val resultado = response.body()

                Toast.makeText(this@MainActivity, resultado!!.resultado[0].nome, Toast.LENGTH_LONG)
                    .show()
            }

            override fun onFailure(call: Call<ApiResponseModel<CharacterModel>>, t: Throwable) {}
        })
    }

    companion object {
        const val BASE_URL = "https://rickandmortyapi.com/api/"
        lateinit var httpClient: Retrofit
    }
}