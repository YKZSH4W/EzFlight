package com.example.ezflight.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.ezflight.screens.LogIn
import com.example.ezflight.screens.SignUp
import com.example.ezflight.screens.Welcome

@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "welcome"
    ) {
        composable("welcome") {
            Welcome(navController)
        }

        composable("login") {
            LogIn(navController)
        }

        composable("signup") {
            SignUp(navController)
        }
    }
}