package com.example.ehsan.daggerlearning

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.ehsan.daggerlearning.model.Warrior
import dagger.android.AndroidInjection
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var warrior: Warrior

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        AndroidInjection.inject(this)
//        (application as MyApplication)
//            .appComponent
//            .plusMainActivityComponent(MainActivityModule())
//            .inject(this)

        Log.d(LOG_TAG, warrior.name)

    }
}
