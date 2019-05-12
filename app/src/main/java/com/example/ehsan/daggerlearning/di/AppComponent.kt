package com.example.ehsan.daggerlearning.di

import com.example.ehsan.daggerlearning.AndroidSampleApp
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule

@Component(modules = [AndroidSupportInjectionModule::class, AppModule::class, ActivityModule::class])
interface AppComponent : AndroidInjector<AndroidSampleApp> {
    @Component.Builder
    abstract class Builder : AndroidInjector.Builder<AndroidSampleApp>()
}