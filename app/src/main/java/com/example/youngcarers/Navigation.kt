package com.example.youngcarers


import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.example.youngcarers.core.emergency
//import com.example.youngcarers.core.getABCList
import com.example.youngcarers.core.tel
import com.example.youngcarers.data.api.service.MainViewModel
import com.example.youngcarers.screens.DetailScreen
import com.example.youngcarers.screens.InsightsDetailScreen
import org.koin.androidx.compose.getViewModel


@Composable
fun Navigation(navController: NavHostController) {

    val mainViewModel = getViewModel<MainViewModel>()

    fun navigateToInsightDetail(questionIndex: Int) {
        navController.navigate(NavRoutes.InsightsDetail.route + "/$questionIndex")
    }

    fun navigateToAbcDetail(abcEntryName: String) {
        navController.navigate(NavRoutes.Detail.route + "/$abcEntryName")
    }

   // mainViewModel.content?.let { content ->
        NavHost(
            navController = navController,
            startDestination = NavigationItem.Help.route
        ) {
            // Insights Page
            composable(NavigationItem.Help.route) {
                mainViewModel.content?.let { content ->
                    HelpScreen(
                        insights = content.insights,
                        navigateToDetail = ::navigateToInsightDetail,
                        navController
                    ) // TODO: Remove this, not needed any more due to function passing
                }
            }

            // Categories Page
            composable(NavigationItem.ABC.route) {
                mainViewModel.content?.let { content ->
                    AbcScreen(
                        navigateToDetail = ::navigateToAbcDetail,
                        navController)
            }}

            // Emergency Page
            composable(NavigationItem.Emergency.route) {
                EmergencyScreen(emergency, tel, navController)
            }

            // About Page
            composable(NavigationItem.About.route) {
                mainViewModel.content?.let { content ->
                    AboutScreen(
                        metadata = content.metadata
                    )
                }

            }

            // Insight Detail Page
            composable(
                NavRoutes.InsightsDetail.route + "/{questionIndex}",
                arguments = listOf(navArgument("questionIndex") { type = NavType.IntType })
            ) { backStackEntry ->
                val questionIndex = backStackEntry.arguments?.getInt("questionIndex")!!

                mainViewModel.content?.let { content ->
                    val insight = content.insights[questionIndex]
                    InsightsDetailScreen(navController, insight)
                }
            }

            // Category Detail Page
            composable(NavRoutes.Detail.route + "/{viewTitle}") { backStackEntry ->
                val viewTitle = backStackEntry.arguments?.getString("viewTitle")
                mainViewModel.content?.let { content ->
                    DetailScreen(navController, viewTitle, content = content.abc)
                }
            }

    }
}

