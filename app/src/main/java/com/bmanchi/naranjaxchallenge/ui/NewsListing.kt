package com.bmanchi.naranjaxchallenge.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.bmanchi.naranjaxchallenge.MainActivity
import com.bmanchi.naranjaxchallenge.R

class NewsListing: Fragment(R.layout.fragment_news_listing) {

    lateinit var viewModel: NewsViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = (activity as MainActivity).viewModel
    }
}