package com.example.androidboilderplatecode

import android.os.Bundle
import com.boilerplate.base.baseclassess.BaseActivity

class MainActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}