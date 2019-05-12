package com.example.ehsan.daggerlearning.ui.main

import android.content.Intent
import android.os.Bundle
import android.util.Log
import com.example.ehsan.daggerlearning.R
import com.example.ehsan.daggerlearning.ui.detail.DetailActivity
import dagger.android.support.DaggerAppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : DaggerAppCompatActivity(), MainView {

    @Inject
    lateinit var mainPresenter: MainPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mainPresenter.loadMain()

        button.setOnClickListener {
            startActivity(Intent(this@MainActivity, DetailActivity::class.java))
        }
    }

    override fun onMainLoaded() {
        Log.v("TEST", "Main page is loaded.")
    }

}
