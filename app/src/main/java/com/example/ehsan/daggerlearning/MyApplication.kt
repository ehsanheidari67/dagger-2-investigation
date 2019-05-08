package com.example.ehsan.daggerlearning

import android.app.Application
import com.example.ehsan.daggerlearning.di.app.AppComponent
import com.example.ehsan.daggerlearning.di.app.AppModule
import com.example.ehsan.daggerlearning.di.app.DaggerAppComponent
import com.example.ehsan.daggerlearning.di.chat.ChatComponent
import com.example.ehsan.daggerlearning.di.chat.DaggerChatComponent
import com.example.ehsan.daggerlearning.di.sc.DaggerSCComponent
import com.example.ehsan.daggerlearning.di.sc.SCComponent
import javax.inject.Inject

class MyApplication : Application() {

    @Inject
    lateinit var networkUtils: NetworkUtils
    @Inject
    lateinit var rxUtils: RxUtilsAbs

    val appComponent: AppComponent by lazy {
        DaggerAppComponent.builder().appModule(AppModule(this)).build()
    }

    override fun onCreate() {
        super.onCreate()

        appComponent.inject(this)
    }
}