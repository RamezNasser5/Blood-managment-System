package com.example.bloodbroject

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
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

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val image = painterResource(id = R.drawable.lfmkhd)
            Image(painter = image, contentDescription = null,
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.Crop)
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                val imageBlood = painterResource(id = R.drawable.blood)
                Image(painter = imageBlood,
                    contentDescription = null,
                    modifier = Modifier
                        .width(200.dp)
                        .height(150.dp)
                )
                Spacer(modifier = Modifier.height(50.dp))
                Button(
                    colors = ButtonDefaults.buttonColors(containerColor = Color(123,40,40)) ,
                    onClick = {
                        val navigate = Intent(this@MainActivity ,LoginPage::class.java)
                        startActivity(navigate)
                              },
                    modifier = Modifier
                        .width(130.dp)
                        .height(50.dp)
                ) {
                    Text(text = stringResource(id = R.string.get_started))
                }
            }
        }
    }
}
