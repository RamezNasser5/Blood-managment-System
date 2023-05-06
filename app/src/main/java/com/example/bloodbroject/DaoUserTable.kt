package com.example.bloodbroject

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import com.example.bloodbroject.entities.DonorTable
import com.example.bloodbroject.entities.RequestTable
import com.example.bloodbroject.entities.UserLocation
import com.example.bloodbroject.entities.UserTable

@Dao
interface DaoUserTable {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertUSerTable(userTable: UserTable)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertDonorTable(donorTable: DonorTable)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertRequestTable(requestTable: RequestTable)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertUSerLocation(userLocation: UserLocation)

//    @Insert
//    suspend fun insertUserName(userName: UserTable)
//
//    @Insert
//    suspend fun insertFirstName(firstNameRegister: UserTable)
//
//    @Insert
//    suspend fun insertSecondName(secondNameRegister: UserTable)
//
//    @Insert
//    suspend fun insertPhoneNumber(phoneNumber: UserTable)
//
//    @Insert
//    suspend fun insertDay(day: UserTable)
//
//    @Insert
//    suspend fun insertMonth(month: UserTable)
//
//    @Insert
//    suspend fun insertYear(year: UserTable)
//
//    @Insert
//    suspend fun insertPassword(password: UserTable)
//
//    @Insert
//    suspend fun insertFirstNameDonor(firstNameDonor: DonorTable)
//
//    @Insert
//    suspend fun insertSecondNameDonor(secondNameDonor: DonorTable)
//
//    @Insert
//    suspend fun insertAge(Age: DonorTable)
//
//    @Insert
//    suspend fun insertLength(Length: DonorTable)
//
//    @Insert
//    suspend fun insertWeight(Weight: DonorTable)
//
//    @Insert
//    suspend fun insertDiseases(Diseases: DonorTable)
//
//    @Insert
//    suspend fun insertNearestHospital(NearestHospital: DonorTable)
//
//    @Insert
//    suspend fun insertFirstNameRequest(firstNameRequest: RequestTable)
//
//    @Insert
//    suspend fun insertSecondNameRequest(secondNameRequest: RequestTable)
//
//    @Insert
//    suspend fun insertHospitalName(HospitalName: RequestTable)
//
//    @Insert
//    suspend fun insertHospitalEmail(HospitalEmail: RequestTable)
//
//    @Insert
//    suspend fun insertBloodType(BloodType: RequestTable)
//
//    @Insert
//    suspend fun insertQuantity(Quantity: RequestTable)

//    @Transaction
//    @Query("SELECT * FROM DonorTable WHERE firstNameDonor = :firstNameDonor")
//    suspend fun getUserTableWithDonorTable(firstNameDonor: String): List<UserTableWithDonorTable>
//
//    @Transaction
//    @Query("SELECT * FROM RequestTable WHERE firstNameRequest = :firstNameRequest")
//    suspend fun getUserTableWithRequestTable(firstNameRequest: String): List<UserTableWithRequestTable>

}