package com.bmanchi.naranjaxchallenge.api

import com.bmanchi.naranjaxchallenge.models.NewsResponse
import com.bmanchi.naranjaxchallenge.util.Constants.Companion.API_KEY
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface NewsAPI {

    @GET("search&format=json&show-fields=thumbnail,headline")
    suspend fun getNews(
        @Query("q")
        q: String = "",
        @Query("api-key")
        apikey: String = API_KEY

    ) : Response<NewsResponse>
}