package com.example.youngcarers.screens.about

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.youngcarers.DataRepository
import com.example.youngcarers.data.api.models.Metadata
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch

class AboutViewModel(
    private val repository: DataRepository
) : ViewModel() {

    val metadata = MutableStateFlow<List<Metadata>>(emptyList())

    init {
        viewModelScope.launch {
            repository.loadContent()?.let {
                metadata.emit(it.metadata)
            }
        }
    }

}