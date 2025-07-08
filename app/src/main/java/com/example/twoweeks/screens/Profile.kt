package com.example.twoweeks.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.carousel.HorizontalMultiBrowseCarousel
import androidx.compose.material3.carousel.rememberCarouselState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.twoweeks.ui.AppTypography

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Profile(
    navController : NavHostController,
    profile : MutableState<Boolean>

){

    Scaffold(
        modifier = Modifier
            .fillMaxSize()
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
                style = AppTypography.headlineMedium,
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

                    Text(
                        "alias:",
                        style = AppTypography.titleSmall
                    )

                    Text(
                        "name:",
                        style = AppTypography.titleSmall
                    )

                    Text(
                        "age:",
                        style = AppTypography.titleSmall
                    )

                    Text(
                        "city:",
                        style = AppTypography.titleSmall
                    )

                    Text(
                        "status:",
                        style = AppTypography.titleSmall
                    )
                }
            }

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
                            "MY AVOCATION",
                            style = AppTypography.titleMedium
                        )

                        IconButton(
                            onClick = {}
                        ) {
                            Icon(
                                Icons.Default.Add,
                                "add avocation")
                        }
                    }

                    HorizontalDivider(thickness = 1.dp)

                    val carouselItems = listOf("one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten")

                    HorizontalMultiBrowseCarousel(
                        state = rememberCarouselState { carouselItems.count() },
                        modifier = Modifier
                            .fillMaxWidth(),
                        preferredItemWidth = 300.dp,
                        itemSpacing = 20.dp
                    ) { i ->
                        val item = carouselItems[i]
                        Column(
                            modifier = Modifier
                                .fillMaxWidth(),
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Text(
                                text = item,
                                style = AppTypography.titleMedium
                            )
                        }
                    }



                }
            }
        }
    }
}