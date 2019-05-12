package com.example.ehsan.daggerlearning.di

import com.example.ehsan.daggerlearning.ui.detail.fragment.DetailFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
interface FragmentModule {
    @ContributesAndroidInjector(modules = [DetailFragmentModule::class])
    fun bindDetailFragment(): DetailFragment
}