package com.example.ehsan.daggerlearning.ui.detail.fragment

import javax.inject.Inject

class DetailFragmentPresenter @Inject constructor(detailFragmentView: DetailFragmentView) {
    init {
        detailFragmentView.onDetailFragmentLoaded()
    }
}