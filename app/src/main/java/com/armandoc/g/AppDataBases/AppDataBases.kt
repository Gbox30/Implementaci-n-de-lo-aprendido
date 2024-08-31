package com.armandoc.g.AppDataBases

import com.armandoc.g.DAOs.PerritoDAO
import com.armandoc.g.Entities.Perrito

@Database(entities = [Perrito::class], version = 1)
abstract class AppDatabase : RoomDatabase() {

    abstract fun PerritoDAO() : PerritoDAO

    companion object {

        @Volatile
        private var INSTANCE : AppDatabase? = null

        fun getDatabase(context : Context) : AppDatabase {

            return INSTANCE ?: synchronized(this) {

                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    AppDatabase::class.java,
                    "AppDatabase"
                ).build()

                INSTANCE = instance
                instance

            }

        }

    }

}