package com.example.androidboilderplatecode.repository


import com.example.androidboilderplatecode.network.RetrofitApi
import com.example.androidboilderplatecode.utils.AppConstants

import javax.inject.Inject


class ApiRepository@Inject constructor(private val apiHelper: RetrofitApi) {

    suspend fun getSampleEntries()=apiHelper.getSampleEntries(AppConstants.SAMPLE_ENTRIES)


}