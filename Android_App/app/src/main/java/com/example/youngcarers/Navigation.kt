package com.example.youngcarers


import android.provider.ContactsContract
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.example.youngcarers.core.emergency
import com.example.youngcarers.core.getABCList
import com.example.youngcarers.core.helps
import com.example.youngcarers.core.tel
import com.example.youngcarers.screens.Detail_Screen


@Composable
fun Navigation(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = NavigationItem.Help.route
    ) {

        composable(NavigationItem.Help.route) {
            Help_Screen(helps, navController)
        }
        composable(NavigationItem.ABC.route) {
            ABC_Screen(getABCList(),navController)
        }
        composable(NavigationItem.Emergency.route) {
            Emergency_Screen(emergency, tel, navController)
        }
        composable(NavigationItem.About.route) {
            About_Screen()
        }
        composable(NavRoutes.Detail.route + "/{viewTitle}"){backStackEntry ->
            val viewTitle = backStackEntry.arguments?.getString("viewTitle")
            Detail_Screen(navController, viewTitle)

        }
    }
}

