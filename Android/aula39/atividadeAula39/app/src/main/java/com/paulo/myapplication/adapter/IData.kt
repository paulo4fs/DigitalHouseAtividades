package com.paulo.myapplication.adapter

import com.paulo.myapplication.entity.TarefaEntity

interface IData {
    fun sendSelected(position: Int, tarefaEntity: TarefaEntity)
}