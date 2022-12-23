package com.example.beerapp.network

import com.squareup.moshi.Json

data class BeerImages (
    val id: String,
    @Json(name= "img_src") val imgSrcUrl: String
        )