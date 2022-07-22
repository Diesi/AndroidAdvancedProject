package com.example.youngcarers

import com.example.youngcarers.data.api.service.APIService
import com.example.youngcarers.data.api.service.MainViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.androidx.viewmodel.dsl.viewModelOf
import org.koin.core.module.dsl.bind
import org.koin.core.module.dsl.singleOf
import org.koin.core.scope.get
import org.koin.dsl.module

val appModule = module {
//    single { APIService.getInstance() }

    // single instance of HelloRepository
    singleOf(::DataRepositoryImpl) { bind<DataRepository>() }

    // MyViewModel ViewModel
    viewModel { MainViewModel(get()) }
}
