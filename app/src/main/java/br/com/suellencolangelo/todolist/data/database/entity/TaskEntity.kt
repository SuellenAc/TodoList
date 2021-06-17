package br.com.suellencolangelo.todolist.data.database.entity

data class TaskEntity(
    val id: String,
    val title: String,
    val description: String,
    val imageUrls: List<String>,
    val links: List<String>,
    val subTasks: List<SubTaskEntity>,
    val isCompleted: Boolean,
    val isArchived: Boolean,
    val category: CategoryEntity,
)
