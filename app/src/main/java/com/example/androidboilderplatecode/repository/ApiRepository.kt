package com.example.androidboilderplatecode.repository

import com.boilerplate.base.retrofit.RetrofitClient
import com.example.androidboilderplatecode.network.RetrofitApi
import com.google.gson.JsonElement
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class ApiRepository(private val retrofitApi: RetrofitApi) {


    fun getSampleEntries() {
        val url: String = "https://api.publicapis.org/entries"
        val task = retrofitApi.getSampleEntries(url = url)
        task.enqueue(object : Callback<JsonElement>{
            override fun onResponse(call: Call<JsonElement>, response: Response<JsonElement>) {

            }

            override fun onFailure(call: Call<JsonElement>, t: Throwable) {

            }

        })


    }
}