package br.com.suellencolangelo.todolist.view.taskList.mapper

import br.com.suellencolangelo.todolist.common.mapper.Mapper
import br.com.suellencolangelo.todolist.domain.model.TaskModel
import br.com.suellencolangelo.todolist.view.taskList.model.TaskCategoryUiModel
import br.com.suellencolangelo.todolist.view.taskList.model.TaskUiModel
import javax.inject.Inject

class TaskModelToUiModelMapper @Inject constructor() : Mapper<TaskModel, TaskUiModel> {

    override fun map(from: TaskModel) = TaskUiModel(
        id = from.id,
        title = from.title,
        description = from.description,
        isCompleted = from.isCompleted,
        isArchived = from.isArchived,
        category = TaskCategoryUiModel(
            title = from.category.title,
            color = from.category.color
        ),
    )
}