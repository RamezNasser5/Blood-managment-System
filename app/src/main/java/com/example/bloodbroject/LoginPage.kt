package com.example.bloodbroject

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
//import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Checkbox
import androidx.compose.material3.ExperimentalMaterial3Api
//import androidx.compose.material3.Checkbox
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
//import androidx.compose.runtime.mutableStateOf
//import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class LoginPage : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            val image = painterResource(id = R.drawable.blood_blood_donation_health_donation__1_)
            Image(painter = image, contentDescription = null,
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.Crop)
            Column (
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .padding(top = 160.dp, bottom = 120.dp, start = 50.dp, end = 50.dp)
                    .background(Color.Red)
            ) {
                Text(text = "Sign In", fontSize = 30.sp,
                    modifier = Modifier
                        .align(Alignment.Start)
                        .padding(start = 20.dp))
                Spacer(modifier = Modifier.height(40.dp))
                UserNameField()
                Spacer(modifier = Modifier.height(15.dp))
                PasswordField()
                Spacer(modifier = Modifier.height(15.dp))
                var checkedState by remember {
                    mutableStateOf(true)
                }
                Row (
                    modifier = Modifier.align(Alignment.Start)
                ){
                    Checkbox(checked = checkedState,
                        onCheckedChange = {checkedState = it})
                    Text(text = stringResource(id = R.string.remember_me),
                        fontSize = 15.sp,
                        modifier = Modifier.padding(top = 13.dp)
                    )

                }
                Spacer(modifier = Modifier.height(30.dp))
                Button(
                    onClick = {
                        val requestNavigate = Intent(this@LoginPage, RequestPage::class.java)
                        startActivity(requestNavigate)
                    },
                    modifier = Modifier
                        .width(130.dp)
                        .height(30.dp)
                ) {
                    Text(text = stringResource(id = R.string.login))
                }

            }

        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PasswordField() {
    var editText by remember {
        mutableStateOf("")
    }
    TextField(
        value = editText,
        onValueChange = { editText = it },
        label = { Text(stringResource(R.string.password)) },
        singleLine = true,
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun UserNameField() {
    var editText by remember {
        mutableStateOf("")
    }
    TextField(
        value = editText,
        onValueChange = { editText = it },
        label = { Text(stringResource(R.string.user_name)) },
        singleLine = true,
    )
}
