package com.example.youngcarers

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun Navigation(navController: NavHostController) {
    NavHost(navController, startDestination = Screen.Home.route) {
        composable(Screen.Home.route) {
            HomeScreen()
        }
        composable(Screen.Screen1.route) {
            Screen1()
        }
        composable(Screen.Screen2.route) {
            Screen2()
        }
        composable(Screen.Screen3.route) {
            Screen3()
        }
    }
}