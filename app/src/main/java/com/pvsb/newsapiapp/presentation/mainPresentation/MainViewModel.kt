package com.pvsb.newsapiapp.presentation.mainPresentation

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.pvsb.newsapiapp.data.repository.Repository
import com.pvsb.newsapiapp.data.response.NewsBodyResponse
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainViewModel(
    private val repository: Repository
) : ViewModel() {

    val newsLiveData: MutableLiveData<List<NewsBodyResponse.NewsDetailsResponse>> = MutableLiveData()

    fun getNewsViewModel() {
        viewModelScope.launch(Dispatchers.IO) {
            runCatching {
                repository.getNews()
            }.onSuccess { articles ->
                val newsList: MutableList<NewsBodyResponse.NewsDetailsResponse> = mutableListOf()
                articles.newsDetails.forEach { news ->
                    newsList.add(news)
                }
                newsLiveData.postValue(newsList)
            }
        }
    }
}
