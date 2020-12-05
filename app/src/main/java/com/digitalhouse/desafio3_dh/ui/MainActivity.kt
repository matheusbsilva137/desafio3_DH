package com.digitalhouse.desafio3_dh.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import com.digitalhouse.desafio3_dh.R
import com.digitalhouse.desafio3_dh.service.repository
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var adapterComics: AdapterComics
    private lateinit var gridLayoutManager: GridLayoutManager

    val viewModel: MainViewModel by viewModels<MainViewModel>{
        object : ViewModelProvider.Factory{
            override fun <T : ViewModel?> create(modelClass: Class<T>): T {
                return MainViewModel(repository) as T
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        gridLayoutManager = GridLayoutManager(this, 3)
        rc_comics.layoutManager = gridLayoutManager

        rc_comics.hasFixedSize()

        viewModel.listComics.observe(this){
            adapterComics = AdapterComics(rc_comics.context, it)
            rc_comics.adapter = adapterComics
        }

        viewModel.popListResult()
    }
}