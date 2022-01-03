package com.example.androidboilderplatecode.network

import com.boilerplate.base.retrofit.RetrofitClient

class RetrofitUtil {

    fun getRetrofitApi(): RetrofitApi? {
        val retrofitClient = RetrofitClient.getInstance()
        return retrofitClient?.provideRetrofit()?.create(RetrofitApi::class.java)
    }
}