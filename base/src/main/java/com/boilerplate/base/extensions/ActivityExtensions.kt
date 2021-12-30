package com.boilerplate.base.extensions

import android.app.Activity
import android.util.Log
import com.boilerplate.base.BuildConfig

fun Activity.logd(tag:String, value:String){
    if(BuildConfig.DEBUG){
        Log.d(tag,value)
    }
}