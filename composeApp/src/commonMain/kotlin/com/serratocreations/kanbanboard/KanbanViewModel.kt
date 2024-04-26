package com.serratocreations.kanbanboard

import androidx.lifecycle.ViewModel

open class KanbanViewModel: ViewModel() {
    fun getGreeting() = "Hello world from KMP Viewmodel"

    override fun onCleared() {
        // TODO some cleanup
        super.onCleared()
    }
}