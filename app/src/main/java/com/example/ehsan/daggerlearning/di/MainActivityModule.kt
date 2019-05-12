package com.example.ehsan.daggerlearning.di

import com.example.ehsan.daggerlearning.ui.main.MainActivity
import com.example.ehsan.daggerlearning.ui.main.MainPresenter
import com.example.ehsan.daggerlearning.ui.main.MainPresenterImpl
import com.example.ehsan.daggerlearning.ui.main.MainView
import dagger.Module
import dagger.Provides

@Module
class MainActivityModule {
    @Provides
    fun provideMainView(mainActivity: MainActivity): MainView = mainActivity

    @Provides
    fun provideMainPresenter(mainPresenterImpl: MainPresenterImpl): MainPresenter = mainPresenterImpl
}