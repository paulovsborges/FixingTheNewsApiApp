package com.pvsb.newsapiapp.data.api

import com.pvsb.newsapiapp.data.response.NewsBodyResponse
import retrofit2.http.GET

interface NewsApi {
    @GET("/v2/everything?q=everything&apiKey=eb14adb4f30842efa48f919d726b52e8")
    suspend fun getNews() : NewsBodyResponse
}