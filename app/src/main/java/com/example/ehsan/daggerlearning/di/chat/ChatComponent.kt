package com.example.ehsan.daggerlearning.di.chat

import android.content.Context
import com.example.ehsan.daggerlearning.IChatInteract
import com.example.ehsan.daggerlearning.di.ChatScope
import com.example.ehsan.daggerlearning.di.app.AppComponent
import dagger.Component

@Component(dependencies = [AppComponent::class], modules = [ChatModule::class])
@ChatScope
interface ChatComponent {

    fun iChatInteract(): IChatInteract

    fun context(): Context

//    fun inject(mainActivity: MainActivity)
}