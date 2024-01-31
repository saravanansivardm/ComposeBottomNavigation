package com.example.bottomnavigationcompose.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Settings
import androidx.compose.ui.graphics.vector.ImageVector


sealed class Screen(
    val route: String,
    val title: String,
    val icon: ImageVector,
) {
    data object Home : Screen(route = "home_screen", "Home", Icons.Default.Home)
    data object Profile : Screen(route = "profile_screen", "Profile", Icons.Default.Person)
    data object Settings : Screen(route = "settings_screen", "Settings", Icons.Default.Settings)
}
