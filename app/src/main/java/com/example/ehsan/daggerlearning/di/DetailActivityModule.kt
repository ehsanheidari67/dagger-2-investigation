package com.example.ehsan.daggerlearning.di

import com.example.ehsan.daggerlearning.ui.detail.DetailActivity
import com.example.ehsan.daggerlearning.ui.detail.DetailPresenter
import com.example.ehsan.daggerlearning.ui.detail.DetailPresenterImpl
import com.example.ehsan.daggerlearning.ui.detail.DetailView
import dagger.Module
import dagger.Provides

@Module
class DetailActivityModule {

    @Provides
    fun provideDetailView(detailActivity: DetailActivity): DetailView = detailActivity

    @Provides
    fun provideDetailPresenter(detailPresenterImpl: DetailPresenterImpl): DetailPresenter = detailPresenterImpl
}