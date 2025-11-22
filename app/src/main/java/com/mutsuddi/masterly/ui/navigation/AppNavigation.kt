package com.mutsuddi.masterly.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.mutsuddi.masterly.ui.feature.home.HomeScreen


@Composable
fun AppNavigation(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Routes.HOME ){
        composable(Routes.HOME){
            HomeScreen()
        }

        composable(Routes.DETAILS){

        }
    }
}