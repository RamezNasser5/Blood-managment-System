package com.example.bloodbroject

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.bloodbroject.entities.DonorTable
import com.example.bloodbroject.entities.RequestTable
import com.example.bloodbroject.entities.UserLocation
import com.example.bloodbroject.entities.UserTable

@Database(
    entities = [
        UserTable::class,
        DonorTable::class,
        RequestTable::class,
        UserLocation::class,
    ],
    version = 1
)
abstract class UserDatabase: RoomDatabase() {

    abstract val daoUserTable: DaoUserTable

    companion object {
        @Volatile
        private var INSTANCE: UserDatabase? = null

        fun getInstance(context: Context): UserDatabase {
            synchronized(this) {
                return INSTANCE ?: Room.databaseBuilder(
                    context.applicationContext,
                    UserDatabase::class.java,
                    "user_db"
                ).build().also {
                    INSTANCE = it
                }
            }
        }
    }
}