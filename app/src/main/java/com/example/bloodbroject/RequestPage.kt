package com.example.bloodbroject

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class RequestPage : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            val image = painterResource(id = R.drawable.background)
            Image(painter = image, contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier.fillMaxSize()
            )
            Column (
                modifier = Modifier.padding(top = 150.dp, start = 20.dp)
                    ){
                Text(text = "~ Welcome To ", fontSize = 30.sp, color = Color(230,30,40))
                Text(text = "Our Blood Bank\n" +
                        "Management System ", fontSize = 40.sp, color = Color(230,30,40))
                Spacer(modifier = Modifier.height(50.dp))
                Row(
                    modifier = Modifier.fillMaxSize()
                ) {
                    Button(
                        shape = RoundedCornerShape(8.dp) ,
                        colors = ButtonDefaults.buttonColors(containerColor = Color(123,40,40)) ,
                        modifier = Modifier
                            .height(200.dp)
                            .padding(start = 40.dp, end = 20.dp) ,
                        onClick = {
                            val sendRequestNavigate = Intent(this@RequestPage, BloodDonation::class.java)
                            startActivity(sendRequestNavigate)
                        }
                    ) {
                        Text(text = stringResource(id = R.string.send_a_request))
                    }
                    Button(
                        shape = RoundedCornerShape(8.dp) ,
                        colors = ButtonDefaults.buttonColors(containerColor = Color(123,40,40)) ,
                        modifier = Modifier.height(200.dp) ,
                        onClick = {
                            val sendRequestNavigate = Intent(this@RequestPage, BloodRequest::class.java)
                            startActivity(sendRequestNavigate)
                        }
                    ) {
                        Text(text = stringResource(id = R.string.view_request))
                    }
                }
            }


        }
    }
}

