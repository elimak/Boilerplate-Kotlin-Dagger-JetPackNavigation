package com.elimak.boilerplate.ui.base

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import io.reactivex.disposables.CompositeDisposable
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob

open class ViewModelBase(application: Application) : AndroidViewModel(application){

    protected var context: Application = application
    // probably use either coroutine or rxjava - not sure it makes sense to use both of them
    protected val compositeDisposable: CompositeDisposable = CompositeDisposable()
    protected val viewModelJob = SupervisorJob()
    protected val viewModelScope = CoroutineScope(Dispatchers.Main + viewModelJob)

    override fun onCleared() {
        super.onCleared()
        compositeDisposable.clear()
        viewModelJob.cancel()
    }
}