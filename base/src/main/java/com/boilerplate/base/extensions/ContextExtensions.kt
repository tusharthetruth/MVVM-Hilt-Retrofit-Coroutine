package com.boilerplate.base.extensions

import android.content.Context
import android.widget.Toast

fun Context.showLToast(message:String?){
    Toast.makeText(this,message,Toast.LENGTH_LONG).show()
}
fun Context.showSToast(message:String?){
    Toast.makeText(this,message,Toast.LENGTH_SHORT).show()
}


