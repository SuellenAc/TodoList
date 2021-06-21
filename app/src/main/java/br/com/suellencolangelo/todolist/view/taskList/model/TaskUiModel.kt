package br.com.suellencolangelo.todolist.view.taskList.model

data class TaskUiModel(
    val id: String,
    val title: String,
    val description: String,
    val isCompleted: Boolean,
    val isArchived: Boolean,
    val category: TaskCategoryUiModel,
)

data class TaskCategoryUiModel(
    val title: String,
    val color: String,
)
