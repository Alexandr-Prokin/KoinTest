package com.example.kointest.di

import com.example.kointest.MainRepository
import com.example.kointest.MainRepositoryImpl
import org.koin.dsl.module

val dataDi = module {
    single<MainRepository> { MainRepositoryImpl() }
}