package com.pvsb.newsapiapp.data.response

import com.google.gson.annotations.SerializedName

data class NewsBodyResponse (

    @SerializedName("articles")
    val newsDetails: List<NewsDetailsResponse>
){
    data class NewsDetailsResponse (

        @SerializedName("author")
        val author: String,

        @SerializedName("title")
        val title: String,

        @SerializedName("description")
        val description: String,

        @SerializedName("url")
        val url: String,

        @SerializedName("urlToImage")
        val urlToImage: String,

        @SerializedName("publishedAt")
        val publishedAt: String,

        @SerializedName("content")
        val content: String
    )
}