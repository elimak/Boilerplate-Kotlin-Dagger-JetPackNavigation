package com.elimak.boilerplate

import android.app.Application
import com.elimak.boilerplate.di.ApplicationComponent
import com.elimak.boilerplate.di.ApplicationModule
import com.elimak.boilerplate.di.DaggerApplicationComponent

class App: Application() {
    lateinit var component: ApplicationComponent

    override fun onCreate() {
        super.onCreate()

        instance = this
        setup()
    }

    fun setup() {
        component = DaggerApplicationComponent.builder()
            .applicationModule(ApplicationModule(this))
            .build()
        component.inject(this)
    }

    fun getApplicationComponent(): ApplicationComponent {
        return component
    }

    companion object {
        lateinit var instance: App private set
    }
}
