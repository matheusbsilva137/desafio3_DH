package com.digitalhouse.desafio3_dh.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.digitalhouse.desafio3_dh.R
import kotlinx.android.synthetic.main.item_comic.view.*

class AdapterComics(): RecyclerView.Adapter<AdapterComics.ComicsViewHolder>() {
    var listComics = ArrayList<String>()

    class ComicsViewHolder(view: View): RecyclerView.ViewHolder(view){
        val tvComics: TextView = view.tv_comic_name
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): AdapterComics.ComicsViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_comic, parent, false)
        return  ComicsViewHolder(view)
    }

    fun addList(list: ArrayList<String>){
        listComics.addAll(list)
    }

    override fun onBindViewHolder(holder: AdapterComics.ComicsViewHolder, position: Int) {
        var item = listComics[position]
        holder.tvComics.text = item.toString()
    }

    override fun getItemCount(): Int = listComics.size

}