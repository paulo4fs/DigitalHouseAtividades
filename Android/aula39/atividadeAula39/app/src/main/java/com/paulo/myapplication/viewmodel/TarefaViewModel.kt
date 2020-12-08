package com.paulo.myapplication.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.paulo.myapplication.entity.TarefaEntity
import com.paulo.myapplication.repository.TarefaRepository
import kotlinx.coroutines.Dispatchers

class TarefaViewModel(private val repository: TarefaRepository) : ViewModel() {
    fun addTarefa(descricao: String) = liveData(Dispatchers.IO) {
        val tarefa = TarefaEntity(0, descricao)
        repository.addTarefa(tarefa)
        emit(tarefa)
    }

    fun getAll() = liveData(Dispatchers.IO) {
        emit(repository.selectAll())
    }

    fun countAll() = liveData(Dispatchers.IO) {
        emit(repository.countAll())
    }

    fun deleteOne(tarefaEntity: TarefaEntity) = liveData(Dispatchers.IO) {
        repository.deleteOne(tarefaEntity)
        emit(true)
    }

    fun deleteAll() = liveData(Dispatchers.IO) {
        repository.deleteAll()
        emit(true)
    }
}