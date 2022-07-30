package com.example.youngcarers

import com.example.youngcarers.data.api.service.APIService
import com.example.youngcarers.screens.abc.AbcViewModel
import com.example.youngcarers.screens.about.AboutViewModel
import com.example.youngcarers.screens.detail.DetailViewModel
import com.example.youngcarers.screens.emergency.EmergencyViewModel
import com.example.youngcarers.screens.help.HelpScreenViewModel
import com.example.youngcarers.screens.insightDetail.InsightsDetailViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

/**
 * App module with repository and view models
 */

val appModule = module {
//    single { APIService.getInstance() }

    // single instance of HelloRepository
    single<DataRepository> {
        DataRepositoryImpl(APIService.getInstance())
    }

    // MyViewModel ViewModel
    viewModel { HelpScreenViewModel(get()) }
    viewModel { AbcViewModel(get()) }
    viewModel { AboutViewModel(get()) }
    viewModel { DetailViewModel(get()) }
    viewModel { EmergencyViewModel(get()) }
    viewModel { InsightsDetailViewModel(get()) }
}
