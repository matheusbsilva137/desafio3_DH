package com.digitalhouse.desafio3_dh.entities

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Comic (@SerializedName("id") @Expose var id: Int,
             @SerializedName("title") @Expose var title: String,
             @SerializedName("description") @Expose var description: String,
             @SerializedName("dates") @Expose var dates: ArrayList<ComicDate>,
             @SerializedName("series") @Expose var series: SeriesSummary,
             @SerializedName("thumbnail") @Expose var thumbnail : Image,
             @SerializedName("images") @Expose var images: ArrayList<Image>,
             @SerializedName("prices") @Expose var prices : ArrayList<ComicPrice>,
             @SerializedName("characters") @Expose var characters: CharacterList,
             @SerializedName("creators") @Expose var creators: CreatorList) {
}