package com.example.bloodbroject.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class RequestTable (
    @PrimaryKey(autoGenerate = false)
    val firstNameRequest: String,
    val secondNameRequest: String,
    val hospitalName: String,
    val hospitalEmail: String,
    val bloodType: String,
    val Quantity: String
)
