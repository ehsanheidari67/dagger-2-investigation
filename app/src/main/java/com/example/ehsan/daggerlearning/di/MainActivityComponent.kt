package com.example.ehsan.daggerlearning.di

import com.example.ehsan.daggerlearning.MainActivity
import dagger.Subcomponent
import dagger.android.AndroidInjector

@MainActivityScope
@Subcomponent(modules = [MainActivityModule::class])
interface MainActivityComponent : AndroidInjector<MainActivity> {
    @Subcomponent.Builder
    abstract class Builder : AndroidInjector.Builder<MainActivity>()

//    fun inject(mainActivity: MainActivity)
}