package com.example.ehsan.daggerlearning.ui.detail

import com.example.ehsan.daggerlearning.data.ApiService
import javax.inject.Inject

class DetailPresenterImpl @Inject constructor(private val detailView: DetailView, private val apiService: ApiService) :
    DetailPresenter {

    override fun loadDetail() {
        apiService.loadData()
        detailView.onDetailLoaded()
    }
}