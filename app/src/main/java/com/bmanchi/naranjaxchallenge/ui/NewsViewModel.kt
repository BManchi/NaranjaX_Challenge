package com.bmanchi.naranjaxchallenge.ui

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.bmanchi.naranjaxchallenge.models.Response
import com.bmanchi.naranjaxchallenge.util.Resource
import kotlinx.coroutines.launch

class NewsViewModel(

) : ViewModel() {

    val breakingNews : MutableLiveData<Resource<Response>> = MutableLiveData()
    var breakingNewsPage = 1
    var breakingNewsResponse: Response? = null

    fun getBreagingNews(query: String) = viewModelScope.launch {

    }
}