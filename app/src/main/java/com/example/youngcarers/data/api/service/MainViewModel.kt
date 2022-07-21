package com.example.youngcarers.data.api.service

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.youngcarers.DataRepository
import com.example.youngcarers.data.api.models.YoungCarersModel
import kotlinx.coroutines.launch
import java.lang.Exception

class MainViewModel (val repository: DataRepository):  ViewModel() {

    //ToDo: cache for speed data loading, data integrated in the build

    var content: YoungCarersModel? by mutableStateOf(null);

    var errorMessage: String by mutableStateOf("")

    init {
        viewModelScope.launch {
            content = loadContent()
        }

    }

    suspend fun loadContent() : YoungCarersModel? {
        return try {
            repository.loadContent()
        } catch (e: Exception) {
            TODO("Write Exception Handling")
        }

    }
}