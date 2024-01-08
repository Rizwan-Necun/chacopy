package com.example.chaquopy

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel: ViewModel() {
    val resourseClick = MutableLiveData<Int>()

    fun onresorceClick(viewId: Int) {
        resourseClick.postValue(viewId)
    }
}