package com.example.youngcarers

import com.example.youngcarers.data.api.service.MainViewModel
import com.example.youngcarers.screens.help.HelpScreenViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {
//    single { APIService.getInstance() }

    // single instance of HelloRepository
//    singleOf(::DataRepositoryImpl) { bind<DataRepository>() }

    single<DataRepository> {
        DataRepositoryImpl()
    }

    // MyViewModel ViewModel
    viewModel { MainViewModel(get()) }
    viewModel { HelpScreenViewModel(get()) }
}
