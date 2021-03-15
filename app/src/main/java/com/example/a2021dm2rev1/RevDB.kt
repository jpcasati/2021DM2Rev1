package com.example.a2021dm2rev1

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Pessoa::class], version = 1)
abstract class RevDB : RoomDatabase() {

    abstract fun PessoaDAO() : PessoaDAO

    companion object {

        private var database: RevDB? = null

        private val DATABASE = "RevDB"

        fun getInstance(context: Context): RevDB? {

            if(database == null)
                return criaBanco(context)
            else
                return database
        }

        private fun criaBanco(context: Context): RevDB {
            return Room.databaseBuilder(context, RevDB::class.java, DATABASE)
                .allowMainThreadQueries()
                .build()
        }
    }
}