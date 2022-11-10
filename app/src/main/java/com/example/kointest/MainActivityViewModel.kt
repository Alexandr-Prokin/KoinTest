package com.example.kointest

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel(private val mainUseCase: MainUseCase): ViewModel() {

    private val _message: MutableLiveData<String> = MutableLiveData()
     val message: LiveData<String> = _message

    fun main(){
       _message.value = mainUseCase.execute("param")
    }
}