package com.example.bloodbroject

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material3.Button
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.unit.toSize

class BloodRequest : ComponentActivity() {
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
                        stringResource(id = R.string.entre_your_location),
                        fontSize = 23.sp,
                        modifier = Modifier.padding(end = 40.dp)
                    )
                    LocationField()
                }
                Spacer(modifier = Modifier.height(40.dp))
                Row {
                    Text(
                        stringResource(id = R.string.nearest_hospital),
                        modifier = Modifier.padding(end = 55.dp),
                        fontSize = 23.sp
                    )
                    DropDownNearestMenu()
                }
                Spacer(modifier = Modifier.height(70.dp))
                Button(
                    onClick = {
                        val sendRequestNavigate = Intent(this@BloodRequest, UserInformation::class.java)
                        startActivity(sendRequestNavigate)
                    },
                    modifier = Modifier.width(130.dp).height(40.dp)
                ) {
                    Text(text = stringResource(id = R.string.next))
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LocationField() {
    var editText by remember {
        mutableStateOf("")
    }
    TextField(
        value = editText,
        onValueChange = { editText = it },
        modifier = Modifier
            .height(60.dp)
            .width(200.dp),
        label = { Text(stringResource(R.string.your_location)) },
        singleLine = true,
    )
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DropDownNearestMenu() {
    var expanded by remember { mutableStateOf(false) }
    val listItems = listOf("University Hospital","Piece Hospital","Assiut Hospital")
    var selectedItem by remember { mutableStateOf("") }
    var textFieldSize by remember { mutableStateOf(Size.Zero) }
    val icon = if (expanded) { Icons.Filled.KeyboardArrowUp }
    else { Icons.Filled.KeyboardArrowDown }

    Column (modifier = Modifier.padding(20.dp)) {
        OutlinedTextField(
            value = selectedItem, onValueChange = {selectedItem = it},
            modifier = Modifier.height(60.dp).width(200.dp)
                .onGloballyPositioned { coordinates -> textFieldSize = coordinates.size.toSize() },
            label = { Text(text = "Select Item")},
            trailingIcon = {
                Icon(icon,"",Modifier.clickable { expanded = !expanded })
            }
        )
        DropdownMenu(
            expanded = expanded, onDismissRequest = { expanded = false },
            modifier = Modifier.width(with(LocalDensity.current){textFieldSize.width.toDp()})
        ) {
            listItems.forEach { label ->
                DropdownMenuItem(text = { Text(text = label) },
                    onClick = {
                        selectedItem = label
                        expanded = false
                    })
            }
        }
    }
}