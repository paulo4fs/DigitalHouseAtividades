package com.digitalhouse.aula31api.listagem.view

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.digitalhouse.aula31api.R
import com.digitalhouse.aula31api.listagem.models.CharacterModel
import com.squareup.picasso.Picasso

class ItemViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {

    private val imagem = view.findViewById<ImageView>(R.id.ivIconCard)
    private val nome = view.findViewById<TextView>(R.id.tvNomeCard)
    private val origem = view.findViewById<TextView>(R.id.tvOrigemCard)
    private val status = view.findViewById<TextView>(R.id.tvStatusCard)
    fun bind(characterModel: CharacterModel) {
        nome.text = characterModel.nome
        origem.text = characterModel.origem.nome
        status.text = characterModel.status
        Picasso.get().load(characterModel.imagem).into(imagem)
    }
}