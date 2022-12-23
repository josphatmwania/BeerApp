package com.example.beerapp.network

import retrofit2.Retrofit
import retrofit2.converter.scalars.ScalarsConverterFactory
import retrofit2.http.GET
import com.squareup.moshi.Moshi
//import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory


/**
 * use Moshi to convert the JSON response into Kotlin objects
 */

private val moshi = Moshi.Builder()

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
    @GET("beers")
    suspend fun getBeers() : String

}

object BeersApi {
    val retrofitService : BeerApiService by lazy {
        retrofit.create(BeerApiService::class.java)
    }
}



//class BeerApiService {
//
//
//}