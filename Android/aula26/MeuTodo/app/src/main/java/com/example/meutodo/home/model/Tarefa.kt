package com.example.meutodo.home.model

import java.util.*

data class Tarefa(
    val descricao: String,
    val dataDeInicio: Date,
    val status: Boolean
)