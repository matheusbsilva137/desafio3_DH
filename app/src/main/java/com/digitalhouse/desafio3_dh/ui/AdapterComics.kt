package com.digitalhouse.desafio3_dh.ui

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.digitalhouse.desafio3_dh.R
import com.digitalhouse.desafio3_dh.entities.Comic
import com.digitalhouse.desafio3_dh.entities.Res
import kotlinx.android.synthetic.main.item_comic.view.*
import com.squareup.picasso.Picasso

class AdapterComics(var context: Context,  var listComics : ArrayList<Comic>): RecyclerView.Adapter<AdapterComics.ComicsViewHolder>() {

    class ComicsViewHolder(comicView: View): RecyclerView.ViewHolder(comicView){
        var view = itemView
        var tvComics: TextView = comicView.tv_comic_name
        var imv_comic : ImageView = comicView.imv_comic
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): AdapterComics.ComicsViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_comic, parent, false)
        return ComicsViewHolder(view)
    }

    override fun onBindViewHolder(holder: AdapterComics.ComicsViewHolder, position: Int) {
        var item = listComics[position]
        holder.tvComics.text = item.title
        var urlImg : String = item.thumbnail.path.replace("http", "https")+"."+item.thumbnail.extension

        Picasso.with(this.context).load(urlImg).into(holder.imv_comic)

        holder.view.setOnClickListener{
            var intent = Intent(it.context, ComicActivity::class.java)
            it.context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int = listComics.size

}