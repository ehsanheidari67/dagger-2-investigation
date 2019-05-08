package com.example.ehsan.daggerlearning

import android.content.Context
import android.util.Log
import javax.inject.Inject

class RxUtils @Inject constructor(private val context: Context) : RxUtilsAbs() {
    init {
        Log.i(LOG_TAG, "RxUtils created!!!")
    }
}