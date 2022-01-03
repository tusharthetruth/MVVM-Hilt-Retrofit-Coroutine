package com.boilerplate.base.retrofit


import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.Retrofit


class RetrofitClient {

    private var BASE_URL: String = "https://google.com"
    private lateinit var retrofit: Retrofit

    init {
        instance = this;
        initRetrofit()
    }

    private fun initRetrofit() {
        retrofit = Retrofit.Builder().baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    fun provideRetrofit(): Retrofit {
        return retrofit
    }

    companion object {
        private var instance: RetrofitClient? = null

        @Synchronized
        fun getInstance(): RetrofitClient? {
            if (instance == null) {
                instance = RetrofitClient()
            }
            return instance
        }
    }

}