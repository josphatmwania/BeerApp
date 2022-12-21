package com.example.beerapp.network

import retrofit2.Retrofit
import retrofit2.converter.scalars.ScalarsConverterFactory
import retrofit2.http.GET

private const val BASE_URL = "https://api.punkapi.com/v2/beers/random"
private val retrofit = Retrofit.Builder()
    .addConverterFactory(ScalarsConverterFactory.create())
    .baseUrl(BASE_URL)
    .build()


/**
 * This interface defines who Retrofit talks to the web server using HTTP requests
 *
 */


interface BeerApiService {

    @ GET("beers")
    fun getBeers(

    )

}



//class BeerApiService {
//
//
//}