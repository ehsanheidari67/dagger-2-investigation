package com.example.ehsan.daggerlearning.ui.detail

import android.os.Bundle
import android.util.Log
import com.example.ehsan.daggerlearning.R
import com.example.ehsan.daggerlearning.ui.detail.fragment.DetailFragment
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject

class DetailActivity : DaggerAppCompatActivity(), DetailView {
    @Inject
    lateinit var detailPresenter: DetailPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        detailPresenter.loadDetail()

        if (savedInstanceState == null)
            supportFragmentManager
                .beginTransaction()
                .add(R.id.container, DetailFragment.newInstance())
                .commitAllowingStateLoss()

    }

    override fun onDetailLoaded() {
        Log.v("TEST", "Detail is loaded")
    }
}