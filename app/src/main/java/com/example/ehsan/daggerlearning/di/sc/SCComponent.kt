package com.example.ehsan.daggerlearning.di.sc

import com.example.ehsan.daggerlearning.MainActivity
import com.example.ehsan.daggerlearning.di.ChatScreenScope
import dagger.Subcomponent

@Subcomponent(modules = [SCModule::class])
@ChatScreenScope
interface SCComponent {

    fun inject(mainActivity: MainActivity)
}