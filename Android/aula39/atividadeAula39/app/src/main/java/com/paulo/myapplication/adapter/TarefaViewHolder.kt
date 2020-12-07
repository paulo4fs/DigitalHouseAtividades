package com.paulo.myapplication.adapter

import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.paulo.myapplication.R
import com.paulo.myapplication.entity.TarefaEntity

class TarefaViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
    private val nome = view.findViewById<TextView>(R.id.tvTarefaList)
    val btnDelete = view.findViewById<Button>(R.id.btnDeleteButton)

    fun bind(tarefa: TarefaEntity) {
        nome.text = tarefa.nome
    }
}