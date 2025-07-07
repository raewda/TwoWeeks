package com.example.twoweeks.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material3.Card
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.twoweeks.ui.AppTypography

@Composable
fun Profile(
    navController : NavHostController,
    profile : MutableState<Boolean>

){
    Scaffold(
        modifier = Modifier
            .fillMaxSize(),
        containerColor = Color.Transparent
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(20.dp)
        ) {
            Text(
                "PROFILE",
                style = AppTypography.titleLarge,
                modifier = Modifier
                    .padding(vertical = 5.dp)
            )

            HorizontalDivider(thickness = 1.dp)

            Card(
                modifier = Modifier
                    .padding(horizontal = 15.dp)
                    .fillMaxWidth()
            ) {
                Column(
                    modifier = Modifier
                        .padding(vertical = 5.dp)
                        .padding(horizontal = 10.dp),
                    verticalArrangement = Arrangement.spacedBy(15.dp),

                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Text(
                            "ME",
                            style = AppTypography.titleMedium
                        )

                        IconButton(
                            onClick = {}
                        ) {
                            Icon(
                                Icons.Default.Edit,
                                "egit profile")
                        }
                    }

                    HorizontalDivider(thickness = 1.dp)

                    // вымышленное имя, ник
                    Text(
                        "alias:"
                    )

                    Text(
                        "name:"
                    )

                    Text(
                        "jopa"
                    )
                }
            }
        }
    }
}