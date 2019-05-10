package com.example.ehsan.daggerlearning

import android.content.Context
import android.util.Log
import androidx.fragment.app.Fragment
import com.example.ehsan.daggerlearning.model.Hero
import javax.inject.Inject

class MainFragment : Fragment() {

    @Inject
    lateinit var hero: Hero

    override fun onAttach(context: Context?) {
        super.onAttach(context)
        Log.d("InjectionTest", hero.name)
    }
}