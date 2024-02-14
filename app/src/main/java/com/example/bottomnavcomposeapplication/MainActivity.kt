package com.example.bottomnavcomposeapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.bottomnavcomposeapplication.ui.theme.BottomNavComposeApplicationTheme
import com.example.bottomnavcomposeapplication.screens.MainScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BottomNavComposeApplicationTheme {
                MainScreen()
            }
        }
    }
}
