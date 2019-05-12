package com.example.ehsan.daggerlearning.di

import com.example.ehsan.daggerlearning.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
interface ActivityModule {
    @MainActivityScope
    @ContributesAndroidInjector(modules = [MainActivityModule::class])
    fun bindMainActivity(): MainActivity
}