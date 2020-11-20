package com.example.myapplication.contador.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ContadorViewModel : ViewModel() {
    var contador = MutableLiveData<Int>()

    init {
        contador.value = 0
    }

    fun incrementar() {
        contador.value = contador.value!! + 1
    }
}