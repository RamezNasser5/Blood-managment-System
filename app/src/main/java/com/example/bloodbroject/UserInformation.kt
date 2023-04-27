package com.example.bloodbroject

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
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
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
            ) {
                Row {
                    Text(
                        stringResource(id = R.string.age1),
                        fontSize = 23.sp,
                        modifier = Modifier.padding(end = 85.dp, top = 15.dp)
                    )
                    Age()
                }
                Spacer(modifier = Modifier.height(20.dp))
                Row {
                    Text(
                        stringResource(id = R.string.length1),
                        fontSize = 23.sp,
                        modifier = Modifier.padding(end = 50.dp, top = 15.dp)
                    )
                    Length()
                }
                Spacer(modifier = Modifier.height(20.dp))
                Row {
                    Text(
                        stringResource(id = R.string.weight1),
                        fontSize = 23.sp,
                        modifier = Modifier.padding(end = 50.dp, top = 15.dp)
                    )
                    Weight()
                }
                Spacer(modifier = Modifier.height(20.dp))
                Row {
                    Text(
                        stringResource(id = R.string.diseases1),
                        fontSize = 23.sp,
                        modifier = Modifier.padding(end = 35.dp, top = 15.dp)
                    )
                    Diseases()
                }
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

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Age() {
    var editText by remember {
        mutableStateOf("")
    }
    TextField(
        value = editText,
        onValueChange = { editText = it },
        modifier = Modifier
            .height(60.dp)
            .width(220.dp),
        label = { Text(stringResource(R.string.age)) },
        singleLine = true,
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Length() {
    var editText by remember {
        mutableStateOf("")
    }
    TextField(
        value = editText,
        onValueChange = { editText = it },
        modifier = Modifier
            .height(60.dp)
            .width(220.dp),
        label = { Text(stringResource(R.string.length)) },
        singleLine = true,
    )
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Weight() {
    var editText by remember {
        mutableStateOf("")
    }
    TextField(
        value = editText,
        onValueChange = { editText = it },
        modifier = Modifier
            .height(60.dp)
            .width(220.dp),
        label = { Text(stringResource(R.string.weight)) },
        singleLine = true,
    )
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Diseases() {
    var editText by remember {
        mutableStateOf("")
    }
    TextField(
        value = editText,
        onValueChange = { editText = it },
        modifier = Modifier
            .height(60.dp)
            .width(220.dp),
        label = { Text(stringResource(R.string.diseases_if_exist)) },
        singleLine = true,
    )
}
