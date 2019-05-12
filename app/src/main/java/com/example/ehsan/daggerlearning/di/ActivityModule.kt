package com.example.ehsan.daggerlearning.di

import com.example.ehsan.daggerlearning.ui.detail.DetailActivity
import com.example.ehsan.daggerlearning.ui.main.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
interface ActivityModule {

    @ContributesAndroidInjector(modules = [MainActivityModule::class])
    fun bindMainActivity(): MainActivity

    @ContributesAndroidInjector(modules = [DetailActivityModule::class, FragmentModule::class])
    fun bindDetailActivity(): DetailActivity
}