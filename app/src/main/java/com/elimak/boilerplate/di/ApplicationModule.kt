package com.elimak.boilerplate.di

import android.app.Application
import android.content.Context
import com.elimak.boilerplate.App
import com.elimak.boilerplate.repository.IRepository
import com.elimak.boilerplate.repository.Repository

import dagger.Module
import dagger.Provides
import javax.inject.Singleton
import kotlin.coroutines.EmptyCoroutineContext

@Module
class ApplicationModule(private val baseApp: App) {

    @Provides
    @AppContext
    fun provideContext(): Context = baseApp.applicationContext

    @Provides
    @AppContext
    fun provideApplication(): Application = baseApp

    @Provides
    @Singleton
    protected fun provideRepository(): IRepository {
        return Repository(baseApp, EmptyCoroutineContext)
    }
}