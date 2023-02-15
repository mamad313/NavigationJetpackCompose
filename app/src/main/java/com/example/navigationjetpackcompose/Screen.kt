package com.example.navigationjetpackcompose

sealed class Screen(val rout: String) {
    object Home: Screen("home_screen")
    object Detail: Screen("detail_screen")
}
