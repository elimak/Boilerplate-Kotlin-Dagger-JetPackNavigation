package com.elimak.boilerplate.ui.main

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.elimak.boilerplate.databinding.MainFragmentBinding

class MainFragment : Fragment() {

    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)
        setHasOptionsMenu(true);
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return MainFragmentBinding.inflate(inflater, container, false).also {
            it.setLifecycleOwner(this)
            it.viewmodel = viewModel
            it.executePendingBindings()
        }.root
    }
}
