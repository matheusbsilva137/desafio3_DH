package com.digitalhouse.desafio3_dh.ui

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.digitalhouse.desafio3_dh.service.Repository
import kotlinx.coroutines.launch

class MainViewModel(val repository: Repository) : ViewModel() {

    val listComics = MutableLiveData<ArrayList<String>>()

    fun popListResult() {
        viewModelScope.launch {
            Log.i(
                    "TAG", repository.getResults(
                    "Spider-Man",
                    1,
                    10,
                    "1",
                    "6eb7e8896ec5850c52515a8a23ee97f0",
                    "40a3aa568bb269dfad85ae0c4a297181"
            ).toString()
            )
        }
    }
}