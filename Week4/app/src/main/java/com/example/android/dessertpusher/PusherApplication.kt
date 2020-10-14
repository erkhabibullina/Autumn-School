package com.example.android.dessertpusher

import android.app.Application
import timber.log.Timber

class PusherApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        // todo (02) подключить Timber на все приложение
        Timber.plant(Timber.DebugTree())
    }
}