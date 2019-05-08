package com.example.ehsan.daggerlearning.di.app

import com.example.ehsan.daggerlearning.RxUtils
import com.example.ehsan.daggerlearning.RxUtilsAbs
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class UtilsModule {

    @Provides
    @Singleton
    fun provideRxUtils(rxUtils: RxUtils): RxUtilsAbs = rxUtils
}