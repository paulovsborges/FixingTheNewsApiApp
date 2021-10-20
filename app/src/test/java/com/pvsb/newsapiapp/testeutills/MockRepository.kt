package com.pvsb.newsapiapp.testeutills

import com.pvsb.newsapiapp.data.repository.Repository
import com.pvsb.newsapiapp.data.response.NewsBodyResponse

class MockRepository(private val newsList : NewsBodyResponse): Repository {

    override suspend fun getNews(): NewsBodyResponse {
        return newsList
    }
}