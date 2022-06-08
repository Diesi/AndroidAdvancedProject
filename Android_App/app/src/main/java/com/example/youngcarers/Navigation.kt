package com.example.youngcarers

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.youngcarers.core.emergency
import com.example.youngcarers.core.getABCList
import com.example.youngcarers.core.helps
import com.example.youngcarers.core.tel

@Composable
fun Navigation(navController: NavHostController) {
    NavHost(navController, startDestination = NavigationItem.Help.route) {
        composable(NavigationItem.Help.route) {
            Help_Screen(helps)
        }
        composable(NavigationItem.ABC.route) {
            ABC_Screen(getABCList())
        }
        composable(NavigationItem.Emergency.route) {
            Emergency_Screen(emergency, tel)
        }
        composable(NavigationItem.About.route) {
            About_Screen()
        }
    }
}