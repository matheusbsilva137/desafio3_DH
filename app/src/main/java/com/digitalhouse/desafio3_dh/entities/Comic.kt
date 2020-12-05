package com.digitalhouse.desafio3_dh.entities

import br.com.digitalhouse.marvelnaticos.marvelnatics.models.ComicDate
import br.com.digitalhouse.marvelnaticos.marvelnatics.models.ComicPrice
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Comic (@SerializedName("id") @Expose var id: Int,
                  @SerializedName("title") @Expose var title: String,
                  @SerializedName("description") @Expose var description: String,
                  @SerializedName("dates") @Expose var dates: ArrayList<ComicDate>,
                  @SerializedName("thumbnail") @Expose var thumbnail : Image,
                  @SerializedName("images") @Expose var images: ArrayList<Image>,
                  @SerializedName("prices") @Expose var prices : ArrayList<ComicPrice>) {
}