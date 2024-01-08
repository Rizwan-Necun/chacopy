package com.example.chaquopy.app

import android.app.Application
import com.example.chaquopy.di.appComponents

import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class MyApplication :Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@MyApplication)
            modules(appComponents)
        }
    }
}

