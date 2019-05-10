package com.example.ehsan.daggerlearning.di

import com.example.ehsan.daggerlearning.model.Warrior
import dagger.Module
import dagger.Provides

@Module
class MainActivityModule {
    @Provides
    @MainActivityScope
    fun provideWarrior() = Warrior("Hercules", "Sword")
}