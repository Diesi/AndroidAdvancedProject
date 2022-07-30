package com.example.youngcarers.screens.abc

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.youngcarers.DataRepository
import com.example.youngcarers.data.api.models.Abc
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch

/**
 * Abc view model
 */

class AbcViewModel(
    private val repository: DataRepository
) : ViewModel() {

    val articles = MutableStateFlow<List<Abc>>(emptyList())

    init {
        viewModelScope.launch {
            repository.loadContent()?.let {
                articles.emit(it.abc)
            }
        }
    }

}