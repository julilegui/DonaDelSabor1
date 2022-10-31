package com.example.donadelsabor.room_database

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity

//Creacion de las tablas de la base de datos.-
data class ToDo(
    @PrimaryKey(autoGenerate = true)
    val id : Int,
    val title : String,
    val content: String,
    val place: String
)


