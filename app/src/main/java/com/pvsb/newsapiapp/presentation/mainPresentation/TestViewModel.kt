package com.pvsb.newsapiapp.presentation.mainPresentation

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class TestViewModel : ViewModel() {

    val stringLivedata = MutableLiveData<Boolean>()

    fun testString(text: String): Boolean {

        if (text.length < 5) {
            stringLivedata.value = true
            return true
        }

        stringLivedata.value = false
        return false
    }
}