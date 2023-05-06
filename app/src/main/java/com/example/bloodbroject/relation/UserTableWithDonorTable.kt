package com.example.bloodbroject.relation

import androidx.room.Embedded
import androidx.room.Relation
import com.example.bloodbroject.entities.DonorTable
import com.example.bloodbroject.entities.UserTable

data class UserTableWithDonorTable (
    @Embedded val firstNameRegister: UserTable,
    @Relation(
        parentColumn = "firstNameRegister",
        entityColumn = "firstNameDonor"
    )
    val Donors: List<DonorTable>,
//    @Embedded val secondNameRegister: UserTable,
//    @Relation(
//        parentColumn = "secondNameRegister",
//        entityColumn = "secondNameDonor"
//    )
//    val secondNameDonor: DonorTable
)

