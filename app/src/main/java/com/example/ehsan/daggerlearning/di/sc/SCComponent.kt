package com.example.ehsan.daggerlearning.di.sc

import com.example.ehsan.daggerlearning.MainActivity
import com.example.ehsan.daggerlearning.di.ChatScreenScope
import com.example.ehsan.daggerlearning.di.chat.ChatComponent
import dagger.Component

@Component(dependencies = [ChatComponent::class], modules = [SCModule::class])
@ChatScreenScope
interface SCComponent {

    fun inject(mainActivity: MainActivity)
}