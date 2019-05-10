package com.example.ehsan.daggerlearning

import android.app.Activity
import android.app.Application
import android.app.Service
import androidx.fragment.app.Fragment
import com.example.ehsan.daggerlearning.di.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import dagger.android.HasServiceInjector
import dagger.android.support.HasSupportFragmentInjector
import javax.inject.Inject

class MyApplication : Application(), HasActivityInjector, HasServiceInjector, HasSupportFragmentInjector {

    @Inject
    lateinit var dispatchingActivityInjector: DispatchingAndroidInjector<Activity>

    @Inject
    lateinit var dispatchingFragmentInjector: DispatchingAndroidInjector<Fragment>

    @Inject
    lateinit var dispatchingServiceInjector: DispatchingAndroidInjector<Service>

    override fun activityInjector(): AndroidInjector<Activity> = dispatchingActivityInjector

    override fun serviceInjector(): AndroidInjector<Service> = dispatchingServiceInjector

    override fun supportFragmentInjector(): AndroidInjector<Fragment> = dispatchingFragmentInjector


//    val appComponent: AppComponent by lazy {
//        DaggerAppComponent.builder().application(this).build()
//    }

    override fun onCreate() {
        super.onCreate()
        DaggerAppComponent.builder().application(this).build().inject(this)
    }
}