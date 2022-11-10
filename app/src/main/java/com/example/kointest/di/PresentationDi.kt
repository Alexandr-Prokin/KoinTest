package com.example.kointest.di

import com.example.kointest.MainActivityViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val presentationDi = module {
    viewModel{
        MainActivityViewModel(get())
    }
}