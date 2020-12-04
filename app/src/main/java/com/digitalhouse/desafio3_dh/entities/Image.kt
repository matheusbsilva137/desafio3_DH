package com.digitalhouse.desafio3_dh.entities
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Image (@SerializedName("path") @Expose var path: String,
             @SerializedName("extension") @Expose var extension: String)