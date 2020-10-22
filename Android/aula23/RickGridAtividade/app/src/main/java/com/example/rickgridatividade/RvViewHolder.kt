package com.example.rickgridatividade

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.digitalhouse.rickapp.api.Personagem
import com.squareup.picasso.Picasso

class RvViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
    private val nome = view.findViewById<TextView>(R.id.tvNome)
    private val localizacao = view.findViewById<TextView>(R.id.tvLocalizacao)
    private val imagem = view.findViewById<ImageView>(R.id.ivImage)

    fun bind(personagens: Personagem) {
        nome.text = personagens.nome
        localizacao.text = personagens.localizacao.nome
        Picasso.get().load(personagens.imagemUrl).into(imagem)
    }
}