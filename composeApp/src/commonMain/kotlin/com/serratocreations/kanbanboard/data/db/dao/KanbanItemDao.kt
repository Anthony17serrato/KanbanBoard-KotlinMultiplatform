package com.serratocreations.kanbanboard.data.db.dao

import com.serratocreations.kanbanboard.data.db.entity.KanbanItem
import kotlinx.coroutines.flow.Flow

interface KanbanItemDao {
    fun addItem(kanbanItem: KanbanItem)

    fun allItemsFlow() : Flow<List<KanbanItem>>

    fun updateKanbanItem(kanbanItem: KanbanItem) : Boolean
}