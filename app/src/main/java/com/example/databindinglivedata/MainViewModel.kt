package com.example.databindinglivedata

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    val quoteMutableLiveData = MutableLiveData<String> ( "We are sure you have a nice name")

    val quoteLiveData : LiveData<String>
    get() = quoteMutableLiveData

    fun updateQuote(){
        quoteMutableLiveData.value = "Yes! my name is Chintan"
    }
}