package com.paulo.myapplication.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.paulo.myapplication.dao.TarefaDao
import com.paulo.myapplication.entity.TarefaEntity

@Database(
    entities = [TarefaEntity::class],
    version = 2,
    exportSchema = false
)
abstract class AppDatabase : RoomDatabase() {
    abstract fun tarefaDao(): TarefaDao

    companion object {
        private var INSTANCE: AppDatabase? = null

        //        Singleton
        fun getDatabase(context: Context): AppDatabase {
            if (INSTANCE == null) {
                INSTANCE = Room.databaseBuilder(
                    context.applicationContext,
                    AppDatabase::class.java,
                    "Tarefa"
                ).build()
            }
            return INSTANCE!!
        }
    }
}