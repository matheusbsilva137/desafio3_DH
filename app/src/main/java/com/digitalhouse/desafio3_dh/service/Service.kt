package com.digitalhouse.desafio3_dh.service

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query

interface Repository{

    @GET("comics")
    suspend fun getResults(
            @Query("name") p1: String,
            @Query("offset")p2: Int,
            @Query("limit")p3: Int,
            @Query("ts") p4: String,
            @Query("apikey")p5: String,
            @Query("hash")p6: String
    ): Res

}

val urlApiMarvel = "https://gateway.marvel.com/v1/public/"

val retrofit = Retrofit.Builder()
        .baseUrl(urlApiMarvel)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

val repository: Repository = retrofit.create(Repository::class.java)