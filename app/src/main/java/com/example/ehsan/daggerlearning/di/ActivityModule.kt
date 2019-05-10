package com.example.ehsan.daggerlearning.di

import com.example.ehsan.daggerlearning.MainActivity
import dagger.Binds
import dagger.Module
import dagger.android.AndroidInjector
import dagger.multibindings.ClassKey
import dagger.multibindings.IntoMap

@Module(subcomponents = [MainActivityComponent::class])
interface ActivityModule {
    @Binds
    @IntoMap
    @ClassKey(MainActivity::class)
    fun bindMainActivityInjectorFactory(builder: MainActivityComponent.Builder): AndroidInjector.Factory<*>
}