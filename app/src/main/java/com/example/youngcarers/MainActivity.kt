package com.example.youngcarers

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.example.youngcarers.data.api.service.MainViewModel
import com.example.youngcarers.ui.theme.YoungCarersTheme
import org.koin.androidx.compose.getViewModel

class MainActivity : ComponentActivity() {

    private val mainViewModel: MainViewModel by viewModels()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainScreen()
        }

    }
}


@Composable
fun MainScreen() {

    val mainViewModel = getViewModel<MainViewModel>()
    val navController = rememberNavController()

    YoungCarersTheme {
        LaunchedEffect(key1 = Unit) {
            mainViewModel.loadContent()
        }

        Scaffold(
            bottomBar = { BottomNavigationBar(navController) }
        )
        {
            Navigation(navController = navController)

        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MainScreen()
}
