package com.example.ehsan.daggerlearning

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.ehsan.daggerlearning.di.chat.ChatComponent
import com.example.ehsan.daggerlearning.di.chat.ChatModule
import com.example.ehsan.daggerlearning.di.sc.SCComponent
import com.example.ehsan.daggerlearning.di.sc.SCModule
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    private val chatComponent: ChatComponent by lazy {
        (application as MyApplication).appComponent.plusChatComponent(ChatModule())
    }

    private val scComponent: SCComponent by lazy {
        chatComponent.plusSCComponent(SCModule())
    }

    @Inject
    lateinit var chatInteract: IChatInteract

    @Inject
    lateinit var iSCPresenter: ISCPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.i(
            LOG_TAG,
            (chatComponent.plusSCComponent(SCModule()) === chatComponent.plusSCComponent(SCModule())).toString()
        )

        scComponent.inject(this)

    }
}
