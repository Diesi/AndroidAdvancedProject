package com.example.youngcarers

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun Navigation(navController: NavHostController) {
    NavHost(navController, startDestination = NavigationItem.Help.route) {
        composable(NavigationItem.Help.route) {
            Help_Screen()
        }
        composable(NavigationItem.ABC.route) {
            ABC_Screen(abcList = arrayListOf())
        }
        composable(NavigationItem.Emergency.route) {
            Emergency_Screen()
        }
        composable(NavigationItem.About.route) {
            About_Screen()
        }
    }
}