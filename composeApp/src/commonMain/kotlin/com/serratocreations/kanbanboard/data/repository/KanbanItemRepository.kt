package com.serratocreations.kanbanboard.data.repository

import com.serratocreations.kanbanboard.data.db.dao.InMemoryKanbanItemDao
import com.serratocreations.kanbanboard.data.db.dao.KanbanItemDao
import com.serratocreations.kanbanboard.data.db.entity.KanbanItem
import kotlinx.coroutines.flow.Flow

object KanbanItemRepository {
    private val kanbanItemDao: KanbanItemDao = InMemoryKanbanItemDao()

    fun addItem(kanbanItem: KanbanItem) =
        kanbanItemDao.addItem(kanbanItem)

    fun kanbanItemsFlow() : Flow<List<KanbanItem>> =
        kanbanItemDao.allItemsFlow()
}