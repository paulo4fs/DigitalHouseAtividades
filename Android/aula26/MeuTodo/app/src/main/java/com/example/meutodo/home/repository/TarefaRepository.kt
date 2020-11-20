package com.example.meutodo.home.repository

import com.example.meutodo.home.model.Tarefa
import java.util.*

class TarefaRepository {
    fun obterTarefas(callback: (tarefas: List<Tarefa>) -> Unit) {
        val listaDeTarefa = obterDoBanco()
        callback.invoke(listaDeTarefa)
    }
//    pegaria dados do banco de dados
    fun obterDoBanco(): List<Tarefa> {
        return listOf(
            Tarefa("Minha tarefa 1", Date(), true),
            Tarefa("Minha tarefa 2", Date(), true),
            Tarefa("Minha tarefa 3", Date(), false)
        )
    }
}