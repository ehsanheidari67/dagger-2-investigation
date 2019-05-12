package com.example.ehsan.daggerlearning.ui.main

import com.example.ehsan.daggerlearning.data.ApiService
import javax.inject.Inject

class MainPresenterImpl @Inject constructor(private val mainView: MainView, private val apiService: ApiService) :
    MainPresenter {
    override fun loadMain() {
        apiService.loadData()
        mainView.onMainLoaded()
    }
}