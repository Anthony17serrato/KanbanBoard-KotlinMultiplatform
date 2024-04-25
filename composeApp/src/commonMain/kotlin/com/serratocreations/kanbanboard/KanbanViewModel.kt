package com.serratocreations.kanbanboard

import com.rickclephas.kmm.viewmodel.KMMViewModel

open class KanbanViewModel: KMMViewModel() {
    fun getGreeting() = "Hello world from KMP Viewmodel"
    override fun onCleared() {
        super.onCleared()
    }
}