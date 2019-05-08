package com.example.ehsan.daggerlearning.di.chat

import com.example.ehsan.daggerlearning.ChatInteract
import com.example.ehsan.daggerlearning.ChatStateController
import com.example.ehsan.daggerlearning.IChatInteract
import com.example.ehsan.daggerlearning.IChatStateController
import com.example.ehsan.daggerlearning.di.ChatScope
import dagger.Module
import dagger.Provides

@Module
class ChatModule {

    @Provides
    @ChatScope
    fun provideIChatInteract(chatInteract: ChatInteract): IChatInteract = chatInteract

    @Provides
    @ChatScope
    fun provideIChatStateController(chatStateController: ChatStateController): IChatStateController =
        chatStateController
}