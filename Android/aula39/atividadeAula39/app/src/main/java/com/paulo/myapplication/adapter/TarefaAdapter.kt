package com.paulo.myapplication.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.paulo.myapplication.R
import com.paulo.myapplication.entity.TarefaEntity

class TarefaAdapter(private var tarefas: MutableList<TarefaEntity>) :
    RecyclerView.Adapter<TarefaViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TarefaViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.card_item_tarefa, parent, false)
        return TarefaViewHolder(view)
    }

    override fun onBindViewHolder(holder: TarefaViewHolder, position: Int) {
        val item = tarefas[position]

        holder.bind(item)
    }

    override fun getItemCount() = tarefas.size
}