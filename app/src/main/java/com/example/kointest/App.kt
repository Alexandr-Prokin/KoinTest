package com.example.kointest

import android.app.Application
import com.example.kointest.di.dataDi
import com.example.kointest.di.domainDi
import com.example.kointest.di.presentationDi
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App: Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@App)
            modules(listOf(presentationDi, domainDi, dataDi))
        }
    }
}