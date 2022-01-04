package com.boilerplate.base.baseclassess

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import com.boilerplate.base.extensions.logd

class BaseDialogFragment :DialogFragment() {

    val TAG = "--Fragment"


    override fun onAttach(context: Context) {
        super.onAttach(context)
        logd(TAG, "onAttach")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        logd(TAG, "onCreate")
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        logd(TAG, "onCreateView")
        return super.onCreateView(inflater, container, savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        logd(TAG, "onViewCreated")

    }

    override fun onStart() {
        super.onStart()
        logd(TAG, "onStart")
    }

    override fun onResume() {
        super.onResume()
        logd(TAG, "onResume")
    }

    override fun onPause() {
        super.onPause()
        logd(TAG, "onPause")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        logd(TAG, "onDestroyView")
    }

    override fun onDestroy() {
        super.onDestroy()
        logd(TAG, "onDestroy")
    }


}