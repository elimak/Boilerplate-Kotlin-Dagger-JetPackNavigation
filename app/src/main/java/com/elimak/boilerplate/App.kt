package com.elimak.boilerplate

import android.app.Application
import com.elimak.boilerplate.di.ApplicationComponent
import com.elimak.boilerplate.di.ApplicationModule
import com.elimak.boilerplate.di.DaggerApplicationComponent

class App: Application() {
    private lateinit var instance: App

    override fun onCreate() {
        super.onCreate()

        instance = this
        setup()
    }

    fun setup() {
        injector = DaggerApplicationComponent.builder()
            .applicationModule(ApplicationModule(this))
            .build()
        injector.inject(this)
    }

    companion object {
        lateinit var injector: ApplicationComponent private set
    }
}
