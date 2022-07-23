package com.example.youngcarers

import com.example.youngcarers.data.api.models.YoungCarersModel
import com.example.youngcarers.data.api.service.APIService

interface DataRepository {
    suspend fun loadContent(): YoungCarersModel?
}

class DataRepositoryImpl : DataRepository {

    override suspend fun loadContent(): YoungCarersModel? {
        val apiService = APIService.getInstance()
        return apiService
            .getContent()
            .body()
    }

}