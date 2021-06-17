package br.com.suellencolangelo.todolist.domain.model

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
) {
    val isAllSubItemsCompleted: Boolean
        get() = subTasks.count { it.isCompleted } == subTasks.size
}
