package com.paulo.myapplication.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.paulo.myapplication.entity.TarefaEntity
import com.paulo.myapplication.repository.TarefaRepository
import kotlinx.coroutines.Dispatchers

class TarefaViewModel(private val repository: TarefaRepository) : ViewModel() {
    fun addTarefa(tarefa: TarefaEntity) = liveData(Dispatchers.IO) {
        repository.addTarefa(tarefa)
        emit(true)
    }

    fun getAll() = liveData(Dispatchers.IO) {
        val all = repository.selectAll()
        emit(all)
    }

    fun countAll() = liveData(Dispatchers.IO) {
        val number = repository.countAll()
        emit(number)
    }
}