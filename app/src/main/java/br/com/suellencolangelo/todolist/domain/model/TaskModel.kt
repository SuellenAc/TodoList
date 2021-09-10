package br.com.suellencolangelo.todolist.domain.model

import java.util.*

data class TaskModel(
    val id: String,
    val title: String,
    val description: String,
    val imageUrls: List<String>,
    val links: List<String>,
    val subTasks: List<SubTaskModel>,
    val isCompleted: Boolean,
    val isArchived: Boolean,
    val category: CategoryModel,
    val createdAt: Date,
    val updatedAt: Date,
) {
    val isAllSubItemsCompleted: Boolean
        get() = subTasks.count { it.isCompleted } == subTasks.size
}
