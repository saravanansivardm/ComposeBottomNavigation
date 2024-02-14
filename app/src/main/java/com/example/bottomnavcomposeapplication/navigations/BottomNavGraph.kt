package com.example.bottomnavcomposeapplication.navigations

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.bottomnavcomposeapplication.screens.HomeScreen
import com.example.bottomnavcomposeapplication.screens.ProfileScreen
import com.example.bottomnavcomposeapplication.screens.SettingsScreen

@Composable
fun BottomNavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = Screen.Home.route
    ) {

        composable(route = Screen.Home.route) {
            HomeScreen()
        }
        composable(route = Screen.Profile.route) {
            ProfileScreen()
        }
        composable(route = Screen.Settings.route) {
            SettingsScreen()
        }
    }
}