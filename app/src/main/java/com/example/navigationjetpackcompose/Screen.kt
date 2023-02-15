package com.example.navigationjetpackcompose

const val DETAIL_ARGUMENT_KEY = "id"
const val DETAIL_ARGUMENT_KEY2 = "name"

sealed class Screen(val rout: String) {
    object Home: Screen("home_screen")
    object Detail: Screen("detail_screen/{$DETAIL_ARGUMENT_KEY}/{$DETAIL_ARGUMENT_KEY2}"){
//        fun passId(id: Int): String {
//            return this.rout.replace(oldValue = "{$DETAIL_ARGUMENT_KEY}", newValue = id.toString())
//        }
        fun passNameAndId(
            id: Int,
            name: String
        ): String {
            return "detail_screen/$id/$name"
        }
    }
}
