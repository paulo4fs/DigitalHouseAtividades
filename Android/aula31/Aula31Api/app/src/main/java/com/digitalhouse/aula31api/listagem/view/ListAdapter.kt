package com.digitalhouse.aula31api.listagem.view

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.digitalhouse.aula31api.R
import com.digitalhouse.aula31api.listagem.models.CharacterModel

class ListAdapter(private val characterModels: List<CharacterModel>) :
    RecyclerView.Adapter<ItemViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.card_list_item, parent, false)
        return ItemViewHolder(view)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = characterModels[position]
        holder.bind(item)
    }

    override fun getItemCount() = characterModels.size
}