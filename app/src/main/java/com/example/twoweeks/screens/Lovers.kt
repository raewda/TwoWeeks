package com.example.twoweeks.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.twoweeks.loversDisplay.MyLover
import com.example.twoweeks.ui.AppTypography

@Composable
fun Lovers(
    navController : NavHostController,
    lovers : MutableState<Boolean>
){
    Scaffold(
        modifier = Modifier
            .fillMaxSize()
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding)
        ) {
            Column(
                modifier = Modifier
                    .padding(innerPadding)
                    .fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(20.dp)
            ) {
                Text(
                    "LOVERS",
                    style = AppTypography.headlineMedium,
                    modifier = Modifier
                        .padding(vertical = 5.dp)
                )

                HorizontalDivider(thickness = 1.dp)

                MyLover()

            }
        }
    }
}