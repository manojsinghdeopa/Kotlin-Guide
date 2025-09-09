package com.kotlin.guide

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.kotlin.guide.ui.screens.ContentScreen
import com.kotlin.guide.ui.screens.TableOfContentsScreen
import com.kotlin.guide.ui.theme.KotlinGuideTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            KotlinGuideTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val navController = rememberNavController()
                    NavHost(navController = navController, startDestination = "table_of_contents") {
                        composable("table_of_contents") {
                            TableOfContentsScreen(onNavigateToSection = { sectionId ->
                                navController.navigate("content_screen/$sectionId")
                            })
                        }
                        composable(
                            route = "content_screen/{sectionId}",
                            arguments = listOf(navArgument("sectionId") { type = NavType.IntType })
                        ) { backStackEntry ->
                            val sectionId = backStackEntry.arguments?.getInt("sectionId")
                            if (sectionId != null) {
                                ContentScreen(sectionId = sectionId, navController = navController)
                            } else {
                                Text("Something went wrong!")
                            }
                        }
                    }
                }
            }
        }
    }
}



