package com.example.youngcarers

import com.example.youngcarers.data.api.models.YoungCarersModel
import com.example.youngcarers.data.api.service.APIService

/**
 * Interface for Data repository
 * Load content from Api
 */

interface DataRepository {
    suspend fun loadContent(): YoungCarersModel?
}

class DataRepositoryImpl(private val apiService: APIService) : DataRepository {

    override suspend fun loadContent(): YoungCarersModel? {
        return apiService
            .getContent()
            .body()
    }

}