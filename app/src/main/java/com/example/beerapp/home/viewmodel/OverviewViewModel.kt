package com.example.beerapp.home.viewmodel

import androidx.lifecycle.*
import com.example.beerapp.network.BeerImages

import com.example.beerapp.network.BeersApi
import kotlinx.coroutines.launch


class OverviewViewModel : ViewModel() {
    private val _status = MutableLiveData<String>()

    /**
     *  Livedata property to store KT object received
     */

    private val _images = MutableLiveData<BeerImages>()
    val images: LiveData<BeerImages> = _images

    val status: LiveData<String> = _status

    init {
        getBeers()
    }



    private fun getBeers() {
        viewModelScope.launch {
            try {
//                val listResult = BeersApi.retrofitService.getBeers()

                _images.value = BeersApi.retrofitService.getBeers()[0]
                /**
                 * Displaying the first IMage URL from the beer Images list
                 */

                _status.value = " First Beer image URL : ${_images.value!!.imgSrcUrl}"
            } catch (e: Exception) {
                _status.value = "Failure: ${e.message}"
            }

        }

    }



}