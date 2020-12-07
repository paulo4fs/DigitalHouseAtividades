package com.paulo.myapplication.repository

import com.paulo.myapplication.dao.TarefaDao
import com.paulo.myapplication.entity.TarefaEntity

class TarefaRepository(private val tarefaDao: TarefaDao) {

    suspend fun addTarefa(tarefa: TarefaEntity) = tarefaDao.addTarefa(tarefa)
    suspend fun selectAll(): List<TarefaEntity> = tarefaDao.selectAll()
    suspend fun countAll(): Int = tarefaDao.countAll()
    suspend fun deleteOne(tarefa: TarefaEntity) = tarefaDao.deleteOne(tarefa)
    suspend fun deleteAll() = tarefaDao.deleteAll()
}