package com.boilerplate.base.baseclassess

import android.content.Context
import androidx.fragment.app.Fragment
import com.boilerplate.base.extensions.logd

open class LoggerFragment:Fragment() {

    var TAG="--"

    override fun onAttach(context: Context) {
        super.onAttach(context)
        logd("$TAG onResume", this.javaClass.simpleName);
    }
}