package com.example.beerapp.network

import com.squareup.moshi.Json

data class BeerImages (
    val id: String,
    // TODO: change this line to @Json(name = "image_url) val imgSrcUrl : String
    @Json(name= "img_src") val imgSrcUrl: String
        )
