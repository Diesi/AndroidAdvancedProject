package com.example.youngcarers


/**
 * Navigation Items for routes
 */

sealed class NavigationItem(
    var route: String,
    var icon: Int,
    var title: String
) {
    object Help : NavigationItem(R.string.nav_help_route.toString(), R.drawable.ic_help_toolbar_gray, R.string.nav_help.toString())
    object ABC : NavigationItem(R.string.nav_abc_route.toString(), R.drawable.ic_abc_toolbar_gray, R.string.nav_abc.toString())
    object Emergency : NavigationItem(R.string.nav_emergency_route.toString(), R.drawable.ic_emergency_toolbar_gray, R.string.emergency_title.toString())
    object About : NavigationItem(R.string.nav_about_route.toString(), R.drawable.ic_about_toolbar_gray, R.string.nav_about.toString())
}

sealed class NavRoutes(
    var route: String,
    var title: String
) {
    object InsightsDetail : NavRoutes(R.string.nav_insights_detail_route.toString(), R.string.nav_insights_detail.toString())
    object Detail : NavRoutes(R.string.nav_detail_route.toString(), R.string.nav_detail.toString())
}