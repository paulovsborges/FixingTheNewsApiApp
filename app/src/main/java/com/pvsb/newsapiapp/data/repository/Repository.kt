package com.pvsb.newsapiapp.data.repository

import com.pvsb.newsapiapp.data.response.NewsBodyResponse

interface Repository {

    suspend fun getNews(): NewsBodyResponse
}