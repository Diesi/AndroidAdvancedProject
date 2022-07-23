package com.example.youngcarers.screens.emergency

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.youngcarers.DataRepository
import com.example.youngcarers.data.api.models.Emergency
import com.example.youngcarers.data.api.models.Metadata
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch

class EmergencyViewModel(
    private val repository: DataRepository
) : ViewModel() {

    val emergency = MutableStateFlow<Emergency?>(null)

    init {
        viewModelScope.launch {
            repository.loadContent()?.let {
                emergency.emit(it.emergency)
            }
        }
    }

}