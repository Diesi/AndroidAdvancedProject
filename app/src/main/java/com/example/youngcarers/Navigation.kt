package com.example.youngcarers

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.example.youngcarers.screens.DetailScreen
import com.example.youngcarers.screens.InsightsDetailScreen

/**
 * Navigation controller, which selects the links and content on the individual pages
 */

@Composable
fun Navigation(navController: NavHostController) {

    // TODO: remove navController integrate this
    fun navigateToInsightDetail(questionIndex: Int) {
        navController.navigate(NavRoutes.InsightsDetail.route + "/$questionIndex")
    }
    // TODO: remove navController integrate this
    fun navigateToAbcDetail(abcEntryName: String) {
        navController.navigate(NavRoutes.Detail.route + "/$abcEntryName")
    }

// mainViewModel.content?.let { content -> // TODO
    NavHost(
        navController = navController,
        startDestination = NavigationItem.Help.route
    ) {

        // Insights Page
        composable(NavigationItem.Help.route) {
            HelpScreen(
                navigateToDetail = {
                        questionIndex: Int -> navController.navigate(NavRoutes.InsightsDetail.route + "/$questionIndex")
                },
                navController
            ) // TODO: Remove this, not needed any more due to function passing
        }

        // Categories Page
        composable(NavigationItem.ABC.route) {
            AbcScreen(
                navigateToDetail = {
                    abcEntryName: String -> navController.navigate(NavRoutes.Detail.route + "/$abcEntryName")
                }
            )
        }

        // Emergency Page
        composable(NavigationItem.Emergency.route) {
            EmergencyScreen( navController )
        }

        // About Page
        composable(NavigationItem.About.route) {
            AboutScreen()
        }

        // Insight Detail Page
        composable(
            NavRoutes.InsightsDetail.route + "/{questionIndex}",
            arguments = listOf(navArgument("questionIndex") { type = NavType.IntType })
        ) { backStackEntry ->
            val questionIndex = backStackEntry.arguments?.getInt("questionIndex")!!
            InsightsDetailScreen(
                navController,
                onClick = {
                    questionIndex: Int -> navController.navigate(NavRoutes.InsightsDetail.route + "/$questionIndex")
                },
                questionIndex)
        }

        // Category Detail Page
        composable(NavRoutes.Detail.route + "/{viewTitle}") { backStackEntry ->
            val viewTitle = backStackEntry.arguments?.getString("viewTitle")
            DetailScreen(navController, viewTitle)
        }

    }
}

