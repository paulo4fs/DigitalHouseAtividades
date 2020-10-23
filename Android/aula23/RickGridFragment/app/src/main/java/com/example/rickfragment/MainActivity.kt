package com.example.rickfragment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.digitalhouse.rickapp.api.IRespostaDaApi
import com.digitalhouse.rickapp.api.Personagem
import com.digitalhouse.rickapp.api.RickApi

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerViewList)
        val manager = GridLayoutManager(this, 2)

        var toast: Toast? = null

        RickApi.getData(this, object : IRespostaDaApi {

            override fun obtevePersonagens(personagens: List<Personagem>) {
                val rvAdapter = RvAdapter(personagens) {
                    toast?.cancel()
                    toast = Toast.makeText(this@MainActivity, it.nome, Toast.LENGTH_LONG)
                    toast?.show()

                    /*
                    val intent = Intent(this@MainActivity, activity_card::class.java)
                    intent.putExtra("name", it.nome)
                    intent.putExtra("localizacao", it.localizacao.nome)
                    intent.putExtra("imagem", it.imagemUrl)
                    intent.putExtra("genero", it.genero)
                    intent.putExtra("status", it.status)

                    startActivity(intent)*/
                }

                recyclerView.apply {
                    setHasFixedSize(true)
                    layoutManager = manager
                    adapter = rvAdapter
                }
            }
        })
    }
}