package com.example.bloodbroject

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class UserRegister(
    @PrimaryKey
    val user_name: String,
    val first_name: String,
    val second_name: String,
    val phone_number: String,
    val day: String,
    val month: String,
    val year: String,
    val password: String,
)
