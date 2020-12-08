package com.paulo.myapplication.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.paulo.myapplication.R
import com.paulo.myapplication.entity.TarefaEntity

class TarefaAdapter(
    private var _tarefas: MutableList<TarefaEntity>,
    var iData: IData,
    private var listener: (TarefaEntity) -> Unit
) :
    RecyclerView.Adapter<TarefaViewHolder>() {

    fun addTarefa(tarefa: TarefaEntity) {
        _tarefas.add(tarefa)
        notifyDataSetChanged()
    }

    fun adicionarTarefas(tarefas: List<TarefaEntity>) {
        _tarefas.addAll(tarefas)
        notifyDataSetChanged()
    }

    fun countAll() = _tarefas.size

    fun deleteOne(position: Int) {
        _tarefas.removeAt(position)
        notifyDataSetChanged()
    }

    fun deleteAll() {
        _tarefas.clear()
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TarefaViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.card_item_tarefa, parent, false)
        return TarefaViewHolder(view)
    }

    override fun onBindViewHolder(holder: TarefaViewHolder, position: Int) {
        val item = _tarefas[position]

        holder.bind(item)
        holder.itemView.setOnClickListener { listener(item) }
        holder.btnDelete.setOnClickListener {
            iData.sendSelected(position,_tarefas[position])
        }
    }

    override fun getItemCount() = _tarefas.size

}