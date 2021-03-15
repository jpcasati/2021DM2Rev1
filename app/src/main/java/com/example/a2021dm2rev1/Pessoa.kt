package com.example.a2021dm2rev1

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Pessoa(
    val nome: String,
    @PrimaryKey(autoGenerate = true)
    val id: Int? = 0
) {
}