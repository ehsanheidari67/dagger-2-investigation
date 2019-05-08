package com.example.ehsan.daggerlearning

import android.content.Context
import android.util.Log
import javax.inject.Inject

class ChatInteract @Inject constructor(
    private val context: Context, private val iDataRepository: IDataRepository,
    private val iChatStateController: IChatStateController
) : IChatInteract {
    init {
        Log.i(LOG_TAG, "ChatInteract created!!!")
    }

}