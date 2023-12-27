package com.example.consumerestapi

import android.app.Application
import com.example.consumerestapi.data.AppContainer
import com.example.consumerestapi.data.KontakContainer

class KontakApplication : Application() {
    lateinit var container: AppContainer
    override fun onCreate() {
        super.onCreate()
        container = KontakContainer()
    }
}