package com.example.eweek05a.model

sealed class ImageUri {
    data class ResImage(val resID:Int) : ImageUri()
    data class WebImage(val webUrl:String) : ImageUri()
}