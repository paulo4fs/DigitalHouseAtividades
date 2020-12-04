package com.paulo.myapplication.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.paulo.myapplication.repository.TarefaRepository

class TarefaViewModelFactory(private val repository: TarefaRepository) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return TarefaViewModel(repository) as T
    }
}