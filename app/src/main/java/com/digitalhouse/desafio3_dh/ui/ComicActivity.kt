package com.digitalhouse.desafio3_dh.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.digitalhouse.desafio3_dh.R
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_comic.*

class ComicActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_comic)

        var title : String = intent.extras?.getString("title").toString()
        var thumb : String = intent.extras?.getString("thumb").toString()
        var imageBkg : String = intent.extras?.getString("image").toString()
        var desc : String = intent.extras?.getString("description").toString()
        var price : String = intent.extras?.getFloat("price").toString()
        var date : String = intent.extras?.getString("date").toString()

        Picasso.with(this).load(thumb).into(imv_thumb)
        Picasso.with(this).load(imageBkg).into(imv_bkg)
        tv_titulo.text = title
        tv_descricao.text = desc
        tv_price.text = "$ "+price
        tv_data_pub.text = date

        imv_return.setOnClickListener{
            finish()
        }
    }
}