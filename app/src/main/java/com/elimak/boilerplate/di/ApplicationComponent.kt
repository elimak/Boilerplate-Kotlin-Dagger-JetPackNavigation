package com.elimak.boilerplate.di

import android.content.Context
import androidx.lifecycle.ViewModel
import com.elimak.boilerplate.App

import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = arrayOf(ApplicationModule::class))
interface ApplicationComponent {

    fun inject(application: App)
    fun inject(viewModel: ViewModel)

    @AppContext
    fun getContext(): Context
}