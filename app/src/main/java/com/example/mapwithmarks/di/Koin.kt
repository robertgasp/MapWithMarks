package com.example.mapwithmarks.di

import com.example.mapwithmarks.ui.viewmodels.MarksViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val marksModule = module{
    single{MarksViewModel()}
}