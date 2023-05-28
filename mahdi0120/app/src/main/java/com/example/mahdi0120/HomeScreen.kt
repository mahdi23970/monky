package com.example.mahdi0120

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
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
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavHostController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(navController: NavHostController) {
    var username by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.Green),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(
                id = com.example.mahdi0120.R.drawable.ico_tvu),
            contentDescription = "Logo Image"
        )
        TextField(
            value = username,
            onValueChange = {username=it},
            label = { Text(text = "نام") },
        )
        TextField(
            value = password,
            onValueChange = {password=it},
            label = { Text(text = "تاریخ تولد") },
        )
        val context= LocalContext.current
        Button(
            onClick = {

                navController.navigate("Second/$username/$password")


            },
            colors = ButtonDefaults.buttonColors(
                Color(0xFF04FF4B)
            )
        ) {
            Text(
                text = "Login",
                color = Color(0xFFFD00E4)
            )
        }

    }

    fun LoginScreen(){

    }
}