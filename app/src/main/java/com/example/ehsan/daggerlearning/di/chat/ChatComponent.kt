package com.example.ehsan.daggerlearning.di.chat

import android.content.Context
import com.example.ehsan.daggerlearning.di.ChatScope
import com.example.ehsan.daggerlearning.di.sc.SCComponent
import com.example.ehsan.daggerlearning.di.sc.SCModule
import dagger.Subcomponent

@Subcomponent(modules = [ChatModule::class])
@ChatScope
interface ChatComponent {

    fun plusSCComponent(scModule: SCModule): SCComponent

    fun context(): Context

//    fun inject(mainActivity: MainActivity)
}