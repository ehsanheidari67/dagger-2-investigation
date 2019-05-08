package com.example.ehsan.daggerlearning

import android.content.Context
import android.util.Log
import javax.inject.Inject

class NetworkUtils @Inject constructor(private val context: Context) {

    init {
        Log.i(LOG_TAG, "NetworkUtils created!!!")
    }

}