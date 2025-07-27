package com.example.twoweeks.screens

import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.SpringSpec
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.AnchoredDraggableState
import androidx.compose.foundation.gestures.DraggableAnchors
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.anchoredDraggable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material3.BottomAppBar
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
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.twoweeks.ui.AppTypography
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.offset
import androidx.compose.ui.layout.onSizeChanged
import androidx.compose.ui.unit.IntOffset
import kotlin.math.roundToInt

private val animationSpec = SpringSpec<Float>(
    dampingRatio = Spring.DampingRatioMediumBouncy,
    stiffness = Spring.StiffnessLow
)

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Profile(
    navController : NavHostController,
    profile : MutableState<Boolean>

){

    val arrowSize = 50.dp

    Scaffold(
        modifier = Modifier.fillMaxSize(),
        bottomBar = {
            BottomAppBar {
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 10.dp)
                ) {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()

                    ) {
                        Icon(
                            imageVector = Icons.Default.ArrowBack,
                            contentDescription = "Swipeable arrow",
                            modifier = Modifier
                                .clickable {
                                    navController.navigate("lovers")
                                }
                                .size(arrowSize)
                                .align(Alignment.CenterEnd)
                        )
                    }
                }
            }
        }

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

                    Row {
                        Text(
                            "alias:",
                            style = AppTypography.titleSmall
                        )
                    }

                    Row {
                        Text(
                            "name:",
                            style = AppTypography.titleSmall
                        )
                    }

                    Row {
                        Text(
                            "age:",
                            style = AppTypography.titleSmall
                        )
                    }

                    Row {
                        Text(
                            "city:",
                            style = AppTypography.titleSmall
                        )
                    }

                    Row {
                        Text(
                            "status:",
                            style = AppTypography.titleSmall
                        )
                    }
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