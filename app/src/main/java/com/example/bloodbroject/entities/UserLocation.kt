package com.example.bloodbroject.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class UserLocation (
    val id: Int,
    @PrimaryKey(autoGenerate = false)
    val location: String,
    val NearestHospital: String
)
