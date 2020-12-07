package com.paulo.myapplication.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.paulo.myapplication.entity.TarefaEntity

@Dao
interface TarefaDao {
    @Insert
    suspend fun addTarefa(tarefa: TarefaEntity)

    @Query("SELECT * FROM Tarefa")
    suspend fun selectAll(): List<TarefaEntity>

    @Query("SELECT COUNT(*) FROM Tarefa")
    suspend fun countAll(): Int

    @Delete
    suspend fun deleteOne(tarefa: TarefaEntity)

    @Query("DELETE FROM Tarefa")
    suspend fun deleteAll()
}