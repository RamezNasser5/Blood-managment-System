package com.example.bloodbroject

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao
interface ContactAccess {
    @Insert
    suspend fun insertUserRegister(contact: UserRegister)

    @Delete
    suspend fun deleteUserRegister(contact: UserRegister)

    @Query("SELECT * FROM UserRegister ORDER BY user_name ASC")
    fun selectFromRegisterUsers(): LiveData<List<UserRegister>>
}