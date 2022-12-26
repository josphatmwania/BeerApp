package com.example.beerapp.home.viewmodel

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewmodels
import com.example.beerapp.databinding.FragmentOVerviewBinding


/**
 *  This fragments shows the Beer images status web services transaction
 */

class OverviewFragment : Fragment() {

    private val viewModel: OverviewViewModel by viewModels()


    /**
     * This OncreateView fun Inflates the layout with Data Binding, sets its lifecycle owner to the OverviewFragment
     * to enable Data Binding to observe LiveData, and sets up the RecyclerView with an adapter.
    */

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentOverviewBinding.inflater(inflater)

        /**
         * Allows Data Binding to Observe LiveData with the lifecycle of this Fragment
         */

        binding.lifecycleOwner = this

        binding.viewmodel = viewModel

        return binding.root

    }


}