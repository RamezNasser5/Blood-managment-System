package com.example.bloodbroject.relation

import androidx.room.Embedded
import androidx.room.Relation
import com.example.bloodbroject.entities.RequestTable
import com.example.bloodbroject.entities.UserTable


data class UserTableWithRequestTable (
    @Embedded val firstNameRegister: UserTable,
    @Relation(
        parentColumn = "firstNameRegister",
        entityColumn = "firstNameRequest"
    )
    val Requests: List<RequestTable>,
)
