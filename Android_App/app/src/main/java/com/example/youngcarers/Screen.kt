package com.example.youngcarers

sealed class Screen(
    val route: String,
    val label: String
    ) {
    object Home: Screen(route = "home", label = "Home")
    object Screen1: Screen(route = "screen1", label = "Screen 1")
    object Screen2: Screen(route = "screen2", label = "Screen 2")
    object Screen3: Screen(route = "screen3", label = "Screen 3")
}