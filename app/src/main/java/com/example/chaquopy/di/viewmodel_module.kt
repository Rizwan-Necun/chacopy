package com.example.chaquopy.di


import com.example.chaquopy.MainActivityViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewNodelModule = module {
    viewModel{ MainActivityViewModel() }

}