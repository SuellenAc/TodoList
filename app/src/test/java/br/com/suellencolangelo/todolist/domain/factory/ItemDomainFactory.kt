package br.com.suellencolangelo.todolist.domain.factory

import br.com.suellencolangelo.todolist.domain.CategoryModel
import br.com.suellencolangelo.todolist.domain.ItemModel
import br.com.suellencolangelo.todolist.domain.SubItemModel

object ItemDomainFactory {
    fun makeItem(
        id: String = "id",
        title: String = "title",
        description: String = "description",
        imageUrls: List<String> = listOf(),
        links: List<String> = listOf(),
        subItems: List<SubItemModel> = makeSubItems(),
        isCompleted: Boolean = false,
        isArchived: Boolean = false,
        category: CategoryModel = makeCategory()
    ) = ItemModel(
        id = id,
        title = title,
        description = description,
        imageUrls = imageUrls,
        links = links,
        subItems = subItems,
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

    fun makeSubItems(): List<SubItemModel> = listOf(makeSubItem())

    fun makeSubItem(
        id: String = "id",
        title: String = "title",
        description: String = "description",
        isCompleted: Boolean = false,
    ) = SubItemModel(
        id = id,
        title = title,
        description = description,
        isCompleted = isCompleted,
    )
}
