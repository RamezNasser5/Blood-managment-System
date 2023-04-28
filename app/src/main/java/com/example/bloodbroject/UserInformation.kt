package com.example.bloodbroject

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
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

class UserInformation : ComponentActivity() {
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
                modifier = Modifier.fillMaxSize()
                    .padding(start = 30.dp, end = 30.dp)
            ) {

                    Text(
                        stringResource(id = R.string.age1),
                        fontSize = 23.sp,
                        modifier = Modifier.padding(start = 15.dp,end = 85.dp, top = 15.dp)
                            .align(Alignment.Start)

                    )
                    UserDetails(R.string.age,450,60)

                Spacer(modifier = Modifier.height(20.dp))

                    Text(
                        stringResource(id = R.string.length1),
                        fontSize = 23.sp,
                        modifier = Modifier.padding(start = 15.dp,end = 50.dp, top = 15.dp)
                            .align(Alignment.Start)

                    )
                    UserDetails(R.string.length1,450,60)

                Spacer(modifier = Modifier.height(20.dp))

                    Text(
                        stringResource(id = R.string.weight1),
                        fontSize = 23.sp,
                        modifier = Modifier.padding(start = 15.dp,end = 50.dp, top = 15.dp)
                            .align(Alignment.Start)

                    )
                    UserDetails(R.string.weight1,450,60)

                Spacer(modifier = Modifier.height(20.dp))

                    Text(
                        stringResource(id = R.string.diseases1),
                        fontSize = 23.sp,
                        modifier = Modifier.padding(start = 15.dp,end = 35.dp, top = 15.dp)
                            .align(Alignment.Start)

                    )
                    UserDetails(R.string.diseases1,450,60)

                Spacer(modifier = Modifier.height(50.dp))
                Button(
                    colors = ButtonDefaults.buttonColors(containerColor = Color(123,40,40)) ,
                    onClick = {  }
                ) {
                    Text(text = stringResource(id = R.string.send))
                }
            }
        }
    }
}
