package com.boilerplate.base.extensions

import android.util.Log
import androidx.fragment.app.Fragment
import com.boilerplate.base.BuildConfig

fun Fragment.logd(tag:String, value:String){
    if(BuildConfig.DEBUG){
        Log.d(tag,value)
    }
}