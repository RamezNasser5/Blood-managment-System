package com.example.bloodbroject

import androidx.room.Database

@Database(
    entities = [UserRegister::class],
    version = 1
)
abstract class UserRegisterDatabase {
    abstract val access: ContactAccess
}