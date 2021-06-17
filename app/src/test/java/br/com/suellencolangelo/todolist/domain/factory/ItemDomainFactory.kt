package br.com.suellencolangelo.todolist.domain.factory

import br.com.suellencolangelo.todolist.domain.model.CategoryModel
import br.com.suellencolangelo.todolist.domain.model.SubTaskModel
import br.com.suellencolangelo.todolist.domain.model.TaskModel

object ItemDomainFactory {
    fun makeItem(
        id: String = "id",
        title: String = "title",
        description: String = "description",
        imageUrls: List<String> = listOf(),
        links: List<String> = listOf(),
        subTasks: List<SubTaskModel> = makeSubItems(),
        isCompleted: Boolean = false,
        isArchived: Boolean = false,
        category: CategoryModel = makeCategory()
    ) = TaskModel(
        id = id,
        title = title,
        description = description,
        imageUrls = imageUrls,
        links = links,
        subTasks = subTasks,
        isCompleted = isCompleted,
        isArchived = isArchived,
        category = category
    )

    private fun makeCategory(
        id: String = "id",
        title: String = "title",
        description: String = "description",
        color: String = "color",
    ) = CategoryModel(
        id = id,
        title = title,
        description = description,
        color = color,
    )

    fun makeSubItems(): List<SubTaskModel> = listOf(makeSubItem())

    fun makeSubItem(
        id: String = "id",
        title: String = "title",
        description: String = "description",
        isCompleted: Boolean = false,
    ) = SubTaskModel(
        id = id,
        title = title,
        description = description,
        isCompleted = isCompleted,
    )
}
