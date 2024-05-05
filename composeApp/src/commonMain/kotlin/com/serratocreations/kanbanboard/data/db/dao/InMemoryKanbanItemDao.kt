package com.serratocreations.kanbanboard.data.db.dao

import com.serratocreations.kanbanboard.data.db.entity.KanbanItem
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOf

class InMemoryKanbanItemDao : KanbanItemDao {
    override fun addItem(kanbanItem: KanbanItem) {
        TODO("Not yet implemented")
    }

    override fun allItemsFlow(): Flow<List<KanbanItem>> {
        return flowOf(listOf(KanbanItem(itemId = 1L, title = "Test", contents = "Some Contents")))
    }

    override fun updateKanbanItem(kanbanItem: KanbanItem): Boolean {
        TODO("Not yet implemented")
    }
}