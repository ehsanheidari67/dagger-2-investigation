package com.example.ehsan.daggerlearning.di.sc

import com.example.ehsan.daggerlearning.ISCPresenter
import com.example.ehsan.daggerlearning.SCPresenter
import com.example.ehsan.daggerlearning.di.ChatScreenScope
import dagger.Module
import dagger.Provides

@Module
class SCModule {

    @Provides
    @ChatScreenScope
    fun provideISCPresenter(scPresenter: SCPresenter): ISCPresenter = scPresenter
}