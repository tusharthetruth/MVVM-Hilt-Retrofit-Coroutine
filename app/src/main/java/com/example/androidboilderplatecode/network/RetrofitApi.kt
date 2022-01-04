package com.example.androidboilderplatecode.network

import com.google.gson.JsonElement
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Url

interface RetrofitApi {

    @GET
    suspend fun getSampleEntries(@Url url:String): Response<JsonElement>
}