package com.paulo.myapplication.adapter

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.paulo.myapplication.R
import com.paulo.myapplication.entity.TarefaEntity
import kotlinx.android.synthetic.main.card_item_tarefa.view.*

class TarefaViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
    private val nome = view.findViewById<TextView>(R.id.tvTarefaList)

    fun bind(tarefaEntity: TarefaEntity) {
        nome.text = tarefaEntity.nome
    }
}