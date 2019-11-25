package com.elimak.boilerplate.ui.main

import androidx.databinding.ObservableField
import androidx.lifecycle.ViewModel
import com.elimak.boilerplate.App
import com.elimak.boilerplate.repository.IRepository
import javax.inject.Inject

class MainViewModel : ViewModel() {
    @Inject
    lateinit var repository: IRepository

    val text: ObservableField<String> = ObservableField("Main Fragment Title")

    init {
        App.instance.getApplicationComponent().inject(this)
    }
}
