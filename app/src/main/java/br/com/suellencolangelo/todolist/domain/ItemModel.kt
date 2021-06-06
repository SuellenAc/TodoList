package br.com.suellencolangelo.todolist.domain

data class ItemModel(
    val id: String,
    val title: String,
    val description: String,
    val imageUrls: List<String>,
    val links: List<String>,
    val subItems: List<SubItemModel>,
    val isCompleted: Boolean,
    val isArchived: Boolean,
    val category: CategoryModel,
) {
    val isAllSubItemsCompleted: Boolean
        get() = subItems.count { it.isCompleted } == subItems.size
}
