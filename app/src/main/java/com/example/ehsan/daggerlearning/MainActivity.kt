package com.example.ehsan.daggerlearning

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.ehsan.daggerlearning.di.chat.ChatComponent
import com.example.ehsan.daggerlearning.di.chat.DaggerChatComponent
import com.example.ehsan.daggerlearning.di.sc.DaggerSCComponent
import com.example.ehsan.daggerlearning.di.sc.SCComponent
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var chatInteract: IChatInteract

    @Inject
    lateinit var iSCPresenter: ISCPresenter

    private val chatComponent: ChatComponent by lazy {
        DaggerChatComponent.builder().appComponent((application as MyApplication).appComponent).build()
    }

    private val scComponent: SCComponent by lazy {
        DaggerSCComponent.builder().chatComponent(chatComponent).build()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        scComponent.inject(this)
    }
}
