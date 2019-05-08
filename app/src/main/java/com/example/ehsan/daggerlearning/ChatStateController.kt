package com.example.ehsan.daggerlearning

import android.util.Log
import javax.inject.Inject

class ChatStateController @Inject constructor() : IChatStateController {
    init {
        Log.i(LOG_TAG, "ChatStateController created!!!")
    }

}