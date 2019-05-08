package com.example.ehsan.daggerlearning.di.app

import com.example.ehsan.daggerlearning.DataRepository
import com.example.ehsan.daggerlearning.IDataRepository
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class DataModule {
    @Provides
    @Singleton
    fun provideIDataRepository(dataRepository: DataRepository): IDataRepository = dataRepository
}