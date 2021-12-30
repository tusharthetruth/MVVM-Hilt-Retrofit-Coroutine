package com.boilerplate.base.baseclassess

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.boilerplate.base.extensions.logd

open class LoggerActivity :AppCompatActivity() {

    var TAG="--"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        logd("$TAG onCreate", this.javaClass.simpleName);
    }

    override fun onStart() {
        super.onStart()
        logd("$TAG onStart", this.javaClass.simpleName);
    }

    override fun onResume() {
        super.onResume()
        logd("$TAG onResume", this.javaClass.simpleName);
    }

    override fun onPause() {
        super.onPause()
        logd("$TAG onResume", this.javaClass.simpleName);
    }

    override fun onStop() {
        super.onStop()
        logd("$TAG onStop", this.javaClass.simpleName);
    }

    override fun onDestroy() {
        super.onDestroy()
        logd("$TAG onDestory", this.javaClass.simpleName);
    }

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        logd("$TAG onNewIntent", this.javaClass.simpleName);
    }
}