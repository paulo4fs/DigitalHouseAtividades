package com.digitalhouse.rickapp.listapersonagem.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.digitalhouse.rickapp.R
import com.digitalhouse.rickapp.api.IRespostaDaApi
import com.digitalhouse.rickapp.listapersonagem.model.Personagem
import com.digitalhouse.rickapp.api.RickApi
import com.digitalhouse.rickapp.listapersonagem.repository.ListaPersonagemRepository
import com.digitalhouse.rickapp.listapersonagem.viewmodel.ListaPersonagemViewModel

class MainActivity : AppCompatActivity() {
    lateinit var viewModel: ListaPersonagemViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel = ViewModelProvider(
            this,
            ListaPersonagemViewModel.ListaPersonagemViewModelFactory(ListaPersonagemRepository(this))
        ).get(ListaPersonagemViewModel::class.java)

        viewModel.personagens.observe(this, Observer {
            criarLista(it)
        })

        viewModel.obterLista()
    }

    fun criarLista(personagens: List<Personagem>) {
        val recyclerView = findViewById<RecyclerView>(R.id.lista)
        val manager = GridLayoutManager(this, 2, GridLayoutManager.VERTICAL, false)

        var toast: Toast? = null

        val customAdapter = CustomAdapter(personagens) {
            toast?.cancel()
            toast = Toast.makeText(this@MainActivity, it.nome, Toast.LENGTH_LONG)
            toast?.show()
        }

        recyclerView.apply {
            setHasFixedSize(true)

            layoutManager = manager
            adapter = customAdapter
        }
    }
}