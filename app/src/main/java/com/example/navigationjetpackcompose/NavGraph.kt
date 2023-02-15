package com.example.navigationjetpackcompose

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun SetupNavGraph(
    navController: NavHostController
){
    NavHost(
        navController = navController,
        startDestination = Screen.Home.rout
    ){
        composable(
            route = Screen.Home.rout
        ){
            HomeScreen(navController)
        }
        composable(
            route = Screen.Detail.rout
        ){
            DetailScreen(navController = navController)
        }
    }
}