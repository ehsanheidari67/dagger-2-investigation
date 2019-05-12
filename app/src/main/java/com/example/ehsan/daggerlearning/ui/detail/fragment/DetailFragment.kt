package com.example.ehsan.daggerlearning.ui.detail.fragment

import android.os.Bundle
import android.util.Log
import dagger.android.support.DaggerFragment
import javax.inject.Inject

class DetailFragment : DaggerFragment(), DetailFragmentView {

    @Inject
    lateinit var detailFragmentPresenter: DetailFragmentPresenter

    override fun onDetailFragmentLoaded() {
        Log.v("TEST", "OnDetailFragmentLoaded.")
    }

    companion object {
        fun newInstance(): DetailFragment {
            val args = Bundle()
            val fragment = DetailFragment()
            fragment.setArguments(args)
            return fragment
        }
    }
}