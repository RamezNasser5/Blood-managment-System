package com.example.bloodbroject.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class UserTable (
    @PrimaryKey(autoGenerate = false)
    val userName: String,
    val firstNameRegister: String,
    val secondNameRegister: String,
    val phoneNumber: String,
    val day: String,
    val month: String,
    val year: String,
    val password: String
)