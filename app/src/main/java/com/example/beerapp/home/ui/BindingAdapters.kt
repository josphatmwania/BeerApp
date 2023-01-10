package com.example.beerapp.home.ui

import android.widget.ImageView
import androidx.core.net.toUri
import androidx.databinding.BindingAdapter
import coil.load
import com.example.beerapp.R

@BindingAdapter("imageUrl")
fun bindImage(imgView: ImageView, imgUrl: String?) {

    /**
     * convert the URL string to a Uri object using the toUri() method.

     */
    imgUrl?.let {
        val imgUri = imgUrl.toUri().buildUpon().scheme("https").build()
        imgView.load(imgUri) {
            placeholder(R.drawable.loading_animation)
            error(R.drawable.ic_broken_image)
        }


    }

}
//class BindingAdapters {
//}