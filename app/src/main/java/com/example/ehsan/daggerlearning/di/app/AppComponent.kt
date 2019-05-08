package com.example.ehsan.daggerlearning.di.app

import android.content.Context
import com.example.ehsan.daggerlearning.IDataRepository
import com.example.ehsan.daggerlearning.MyApplication
import dagger.Component
import javax.inject.Singleton

@Component(modules = [AppModule::class, DataModule::class, UtilsModule::class])
@Singleton
interface AppComponent {

    fun context(): Context

    fun iDataRepository(): IDataRepository

    fun inject(myApplication: MyApplication)
}