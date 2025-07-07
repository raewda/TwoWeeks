package com.example.twoweeks

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.twoweeks.screens.Lovers
import com.example.twoweeks.screens.Profile
import com.example.twoweeks.screens.Start
import com.example.twoweeks.ui.TwoWeeksTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TwoWeeksTheme {

                val navController = rememberNavController()

                val profile = remember { mutableStateOf(false) }
                val lovers = remember { mutableStateOf(false) }
                val start = remember { mutableStateOf(false) }

                NavHost(
                    navController = navController,
                    startDestination = "profile"
                ){
                    composable("profile") {
                        Profile(
                            navController,
                            profile = profile
                        )
                    }
                    composable("start") {
                        Start(
                            navController,
                            start = start
                        )
                    }
                    composable("lovers") {
                        Lovers(
                            navController,
                            lovers = lovers
                        )
                    }
                }
            }
        }
    }
}