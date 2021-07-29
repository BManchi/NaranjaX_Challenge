package com.bmanchi.naranjaxchallenge.repository

import com.bmanchi.naranjaxchallenge.api.RetrofitInstance

class NewsRepository(
    //val db: ArticleDatabase
) {
    suspend fun getNews(query: String) =
        RetrofitInstance.api.getNews(query)
}