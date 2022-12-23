package com.example.beerapp.network

import com.squareup.moshi.KotlinJsonAdapterFactory
import retrofit2.Retrofit
import retrofit2.http.GET
import com.squareup.moshi.Moshi
import retrofit2.converter.moshi.MoshiConverterFactory

/**
 * use Moshi to convert the JSON response into Kotlin objects
 */

private val moshi = Moshi.Builder()
    .add(KotlinJsonAdapterFactory())
    .build()

private const val BASE_URL = "https://api.punkapi.com/v2/beers/random"
private val retrofit = Retrofit.Builder()
    .addConverterFactory(MoshiConverterFactory.create(moshi))
    .baseUrl(BASE_URL)
    .build()


/**
 * This interface defines who Retrofit talks to the web server using HTTP requests
 *
 */


interface BeerApiService {
    @GET("beers")
    suspend fun getBeers() : List<BeerImages>

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