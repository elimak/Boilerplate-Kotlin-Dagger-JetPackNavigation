package com.elimak.boilerplate.ui.main

import android.app.Application
import androidx.databinding.ObservableField
import com.elimak.boilerplate.App
import com.elimak.boilerplate.repository.IRepository
import com.elimak.boilerplate.ui.base.ViewModelBase
import javax.inject.Inject

class MainViewModel(application: Application) : ViewModelBase(application) {
    @Inject
    lateinit var repository: IRepository

    val text: ObservableField<String> = ObservableField("Main Fragment Title")

    init {
        App.injector.inject(this)
    }
}
