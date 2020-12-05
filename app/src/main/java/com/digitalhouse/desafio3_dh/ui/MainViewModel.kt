package com.digitalhouse.desafio3_dh.ui

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.digitalhouse.desafio3_dh.entities.Comic
import com.digitalhouse.desafio3_dh.entities.Res
import com.digitalhouse.desafio3_dh.service.Repository
import kotlinx.coroutines.launch

class MainViewModel(val repository: Repository) : ViewModel() {

    val listComics = MutableLiveData<ArrayList<Comic>>()

    fun popListResult() {
        viewModelScope.launch {
            var res: Res = repository.getResults(
                    1,
                    10,
                    1,
                    "7fe2f369a42bdcb202b9765dabbd3f56",
                    "99861f0dd5cee448192f4df6da070380"
            )

            listComics.value = res.data.results
        }
    }
}