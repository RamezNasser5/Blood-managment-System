package com.example.bloodbroject

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.lifecycleScope
import com.example.bloodbroject.entities.UserTable
import kotlinx.coroutines.launch

class Registration : ComponentActivity() {
    private var userName: String
    private var firstName: String
    private var secondName: String
    private var phoneNumber: String
    private var day: String
    private var month: String
    private var year: String
    private var password: String
    private var main = MainActivity()
    init {
        this.userName = ""
        this.firstName = ""
        this.secondName = ""
        this.phoneNumber = ""
        this.day = ""
        this.month = ""
        this.year = ""
        this.password = ""
    }

    fun getFirstName(): String{
        return firstName
    }

    fun getSecondName(): String{
        return secondName
    }
    @SuppressLint("CoroutineCreationDuringComposition")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {

            val image = painterResource(id = R.drawable.background)

            Image(painter = image, contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier.fillMaxSize()
            )
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.fillMaxSize().padding(start = 30.dp, end = 30.dp)
            ) {

                Text(
                    stringResource(id = R.string.user_name),
                    fontSize = 23.sp,
                    modifier = Modifier.padding(start = 15.dp,end = 50.dp, top = 15.dp)
                        .align(Alignment.Start)
                )
                userName = userDetails(R.string.user_name,450,50)

                Spacer(modifier = Modifier.height(10.dp))
                Text(
                    stringResource(id = R.string.first_name),
                    fontSize = 23.sp,
                    modifier = Modifier.padding(start = 15.dp,end = 50.dp, top = 15.dp)
                        .align(Alignment.Start)
                )
                firstName = userDetails(R.string.first_name,450,50)

                Spacer(modifier = Modifier.height(10.dp))

                Text(
                    stringResource(id = R.string.second_name),
                    fontSize = 23.sp,
                    modifier = Modifier.padding(start = 15.dp,end = 25.dp, top = 15.dp)
                        .align(Alignment.Start)
                )
                secondName = userDetails(R.string.second_name,450,50)

                Spacer(modifier = Modifier.height(10.dp))

                Text(
                    stringResource(id = R.string.phone_number),
                    fontSize = 23.sp,
                    modifier = Modifier.padding(start = 15.dp,end = 25.dp, top = 15.dp)
                        .align(Alignment.Start)
                )
                phoneNumber = userDetails(R.string.phone_number,450,50)

                Spacer(modifier = Modifier.height(10.dp))

                Text(
                    stringResource(id = R.string.date_barth),
                    fontSize = 23.sp,
                    modifier = Modifier.padding(start = 15.dp,end = 35.dp, top = 15.dp)
                        .align(Alignment.Start)
                )
                Row{
                    day = userDetails(R.string.day,120,50)
                    month = userDetails(R.string.month,120,50)
                    year = userDetails(R.string.years,120,50)
                }


                Spacer(modifier = Modifier.height(10.dp))

                Text(
                    stringResource(id = R.string.password),
                    fontSize = 23.sp,
                    modifier = Modifier.padding(start = 15.dp,end = 25.dp, top = 15.dp)
                        .align(Alignment.Start)
                )
                password = userDetails(R.string.password,450,50)

                Spacer(modifier = Modifier.height(30.dp))
                Button(
                    colors = ButtonDefaults.buttonColors(containerColor = Color(123,40,40)) ,
                    onClick = {
                        lifecycleScope.launch { main.getDao().insertUSerTable(UserTable(
                            userName,firstName,secondName,phoneNumber,day,month, year, password
                        )) }
                        val navigate = Intent(this@Registration ,LoginPage::class.java)
                        startActivity(navigate)
                    }
                ) {
                    Text(text = stringResource(id = R.string.registration))
                }
            }
        }
    }
}
