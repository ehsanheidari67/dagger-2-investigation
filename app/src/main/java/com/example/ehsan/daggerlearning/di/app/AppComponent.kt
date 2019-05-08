package com.example.ehsan.daggerlearning.di.app

import com.example.ehsan.daggerlearning.MyApplication
import com.example.ehsan.daggerlearning.di.chat.ChatComponent
import com.example.ehsan.daggerlearning.di.chat.ChatModule
import dagger.Component
import javax.inject.Singleton

@Component(modules = [AppModule::class, DataModule::class, UtilsModule::class])
@Singleton
interface AppComponent {

    fun plusChatComponent(chatModule: ChatModule): ChatComponent

    fun inject(myApplication: MyApplication)
}