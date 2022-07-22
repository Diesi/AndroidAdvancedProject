package com.example.youngcarers.screens.help

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.youngcarers.DataRepository
import com.example.youngcarers.data.api.models.Insight
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch

class HelpScreenViewModel(
    private val repository: DataRepository
) : ViewModel() {

    val insights = MutableStateFlow<List<Insight>>(emptyList())

    init {
        viewModelScope.launch {
            repository.loadContent()?.let {
                insights.emit(it.insights)
            }
        }

    }





}