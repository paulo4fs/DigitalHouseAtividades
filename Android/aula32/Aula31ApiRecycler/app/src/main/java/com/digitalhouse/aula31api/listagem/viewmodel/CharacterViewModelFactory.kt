package com.digitalhouse.aula31api.listagem.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.digitalhouse.aula31api.listagem.repository.CharacterRepository

class CharacterViewModelFactory(val repository: CharacterRepository) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return CharacterViewModel(repository) as T
    }
}