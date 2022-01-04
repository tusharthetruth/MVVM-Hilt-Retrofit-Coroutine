package com.boilerplate.base.extensions

import android.app.Application
import android.content.Context
import android.util.Log
import com.boilerplate.base.BuildConfig
import androidx.core.content.ContextCompat.getSystemService

import android.net.ConnectivityManager
import androidx.core.content.ContextCompat


fun Any.logd(tag:String, value:String){
    if(BuildConfig.DEBUG){
        Log.d(tag,value)
    }
}

