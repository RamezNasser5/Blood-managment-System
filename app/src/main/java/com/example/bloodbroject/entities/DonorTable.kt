package com.example.bloodbroject.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class DonorTable (
    @PrimaryKey(autoGenerate = false)
    val firstNameDonor: String,
    val secondNameDonor: String,
    val age: String,
    val length: String,
    val weight: String,
    val diseases: String,
    val nearestHospital: String,
)