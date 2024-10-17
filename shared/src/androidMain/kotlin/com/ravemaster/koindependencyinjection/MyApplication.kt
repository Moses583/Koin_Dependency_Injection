package com.ravemaster.koindependencyinjection

import android.app.Application
import com.ravemaster.koindependencyinjection.di.initKoin
import org.koin.android.ext.koin.androidContext

class MyApplication: Application() {
    override fun onCreate() {
        super.onCreate()
        initKoin{
            androidContext(this@MyApplication)
        }

    }
}