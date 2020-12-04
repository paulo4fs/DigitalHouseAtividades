package com.paulo.myapplication.repository

import com.paulo.myapplication.dao.TarefaDao
import com.paulo.myapplication.entity.TarefaEntity

class TarefaRepository(private val tarefaDao: TarefaDao) {

    suspend fun addTarefa(tarefa: TarefaEntity) = tarefaDao.addTarefa(tarefa)
    suspend fun selectAll() = tarefaDao.selectAll()
    suspend fun countAll() = tarefaDao.countAll()
}