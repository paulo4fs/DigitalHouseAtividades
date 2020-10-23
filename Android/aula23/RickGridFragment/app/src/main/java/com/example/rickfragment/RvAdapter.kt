package com.example.rickfragment

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.digitalhouse.rickapp.api.Personagem

class RvAdapter(
    private val personagens: List<Personagem>,
    private val listener: (Personagem) -> Unit
) :
    RecyclerView.Adapter<RvViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RvViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.card_item, parent, false)

        return RvViewHolder(view)
    }

    override fun getItemCount() = personagens.size

    override fun onBindViewHolder(holder: RvViewHolder, position: Int) {
        val item = personagens[position]
        holder.bind(item)

        holder.itemView.setOnClickListener { listener(item) }
    }
}