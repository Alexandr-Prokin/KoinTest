package com.example.kointest.di

import com.example.kointest.MainUseCase
import org.koin.dsl.module

val domainDi = module{
    factory {
        MainUseCase(get())
    }
}