package com.elimak.boilerplate.ui.main

import androidx.databinding.ObservableField
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    val text: ObservableField<String> = ObservableField("Main Fragment Title")
}
