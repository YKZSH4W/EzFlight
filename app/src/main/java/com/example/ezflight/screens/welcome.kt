package com.example.ezflight.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.ezflight.R
import com.example.ezflight.components.PrimaryBtn
import com.example.ezflight.components.SecondaryBtn

@Composable
fun Welcome(navController: NavController) {
    Box(
        modifier = Modifier.fillMaxSize().background(Color.White),
        contentAlignment = Alignment.Center
    ) {
        Column(
            modifier = Modifier.fillMaxSize()
        ) {
            Box(
                modifier = Modifier.fillMaxWidth().height(470.dp)
            ) {
                Image(
                    painter = painterResource(R.drawable.airplane),
                    contentDescription = "Avion Estacionado",
                    modifier = Modifier.fillMaxSize(),
                    contentScale = ContentScale.Crop,
                )

                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(Color.Black.copy(alpha = 0.2f))
                )

                Image(
                    painter = painterResource(R.drawable.wave_vector),
                    contentDescription = "Avion Estacionado",
                    modifier = Modifier
                        .fillMaxWidth()
                        .align(Alignment.BottomCenter),
                    contentScale = ContentScale.Crop,
                )
            }

            Box(
                modifier = Modifier.fillMaxWidth(),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "Live your next adventure!",
                    color = Color.Black,
                    fontWeight = FontWeight.ExtraBold,
                    fontSize = 30.sp,
                    modifier = Modifier.width(200.dp),
                    textAlign = TextAlign.Center,
                    style = TextStyle(
                        lineHeight = 35.sp
                    )
                )
            }

            Box(
                modifier = Modifier.fillMaxSize().padding(50.dp, 20.dp)
            ) {
                Column(
                    modifier = Modifier.fillMaxSize(),
                    verticalArrangement = Arrangement.Bottom
                ) {
                    PrimaryBtn("Log in", onClick = { navController.navigate("login") })

                    Spacer(modifier = Modifier.height(10.dp))

                    SecondaryBtn("Sign Up", onClick = { navController.navigate("signup") })

                    Spacer(modifier = Modifier.height(15.dp))

                    Text(
                        text = "Continue as a guest",
                        color = Color(0xFF009DFF),
                        modifier = Modifier.fillMaxWidth(),
                        style = TextStyle(textDecoration = TextDecoration.Underline),
                        textAlign = TextAlign.Center
                    )
                }
            }
        }
    }
}