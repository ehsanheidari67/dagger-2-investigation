package com.example.ehsan.daggerlearning

import android.content.Context
import android.util.Log
import javax.inject.Inject

class SCPresenter @Inject constructor(private val context: Context, private val iChatInteract: IChatInteract) :
    ISCPresenter {
    init {
        Log.i(LOG_TAG, "SCPresenter created!!!")
    }
}