package com.example.ezflight.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
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
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.ezflight.R
import com.example.ezflight.components.BackBtn
import com.example.ezflight.components.CustomField
import com.example.ezflight.components.LineWithText
import com.example.ezflight.components.PrimaryBtn
import com.example.ezflight.components.SocialMedia

@Composable
fun SignUp(navController: NavController) {
    Box(
        modifier = Modifier.fillMaxSize().padding(20.dp),
        contentAlignment = Alignment.Center
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Top
        ) {
            BackBtn(onClick = {navController.navigate("welcome")})

            Spacer(modifier = Modifier.height(20.dp))


            Column(
                modifier = Modifier.fillMaxWidth().padding(10.dp,0.dp),
                verticalArrangement = Arrangement.Top,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "Hello register to get started",
                    color = Color.Black,
                    fontWeight = FontWeight.ExtraBold,
                    fontSize = 30.sp,
                    style = TextStyle(lineHeight = 35.sp)
                )

                Spacer(modifier = Modifier.height(60.dp))

                CustomField("Enter your name", onValueChange = {})

                Spacer(modifier = Modifier.height(10.dp))

                CustomField("Enter your email", onValueChange = {})

                Spacer(modifier = Modifier.height(10.dp))

                CustomField("Create a password", onValueChange = {})

                Spacer(modifier = Modifier.height(10.dp))

                CustomField("Confirm password", onValueChange = {})

                Spacer(modifier = Modifier.height(40.dp))

                PrimaryBtn("Sign up", onClick = {})

                Spacer(modifier = Modifier.height(50.dp))

                LineWithText("Or sign up with")

                Spacer(modifier = Modifier.height(50.dp))

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center
                ) {
                    SocialMedia(
                        id = R.drawable.facebook_vector,
                        contentDescription = "Facebook",
                        size = 38,
                        onClick = {}
                    )

                    Spacer(modifier = Modifier.width(15.dp))

                    SocialMedia(
                        id = R.drawable.google_vector,
                        contentDescription = "Google",
                        size = 28,
                        onClick = {}
                    )

                    Spacer(modifier = Modifier.width(15.dp))

                    SocialMedia(
                        id = R.drawable.apple_vector,
                        contentDescription = "Apple",
                        size = 38,
                        onClick = {}
                    )
                }

                Box (
                    modifier = Modifier.fillMaxSize(),
                    contentAlignment = Alignment.BottomCenter
                ) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.Center,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = "Already have an account?",
                            color = Color(0xFF3B3B3B),
                            fontSize = 12.sp
                        )

                        Spacer(modifier = Modifier.width(5.dp))

                        Text(
                            text = "Login now",
                            color = Color(0xFF009DFF),
                            style = TextStyle(textDecoration = TextDecoration.Underline),
                        )
                    }
                }
            }
        }
    }
}
