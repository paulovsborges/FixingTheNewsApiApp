package com.pvsb.newsapiapp.data.repository

import com.pvsb.newsapiapp.data.api.NewsApi
import com.pvsb.newsapiapp.data.response.NewsBodyResponse


class RepositoryImpl(private val api: NewsApi): Repository {

    override suspend fun getNews(): NewsBodyResponse = api.getNews()
}