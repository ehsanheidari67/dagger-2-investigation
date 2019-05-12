package com.example.ehsan.daggerlearning.di

import com.example.ehsan.daggerlearning.ui.detail.fragment.DetailFragment
import com.example.ehsan.daggerlearning.ui.detail.fragment.DetailFragmentView
import dagger.Module
import dagger.Provides

@Module
class DetailFragmentModule {

    @Provides
    fun provideDetailFragmentView(detailFragment: DetailFragment): DetailFragmentView = detailFragment
}