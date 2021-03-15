package com.example.a2021dm2rev1

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface PessoaDAO {

    @Insert
    fun salvar(p: Pessoa)

    @Query("SELECT * FROM Pessoa")
    fun listar(): List<Pessoa>

}