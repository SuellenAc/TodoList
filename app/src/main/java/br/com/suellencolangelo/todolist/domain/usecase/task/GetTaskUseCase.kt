package br.com.suellencolangelo.todolist.domain.usecase.task

import br.com.suellencolangelo.todolist.domain.model.TaskModel
import javax.inject.Inject

interface GetTaskUseCase {
    suspend fun getTask(taskId: String): Result<TaskModel>
    suspend fun getAll(): Result<List<TaskModel>>
    suspend fun getByCategory(categoryId: String): Result<List<TaskModel>>
}

class GetTaskUseCaseImpl @Inject constructor() : GetTaskUseCase {

    override suspend fun getTask(taskId: String): Result<TaskModel> {
        TODO("Not yet implemented")
    }

    override suspend fun getAll(): Result<List<TaskModel>> {
        TODO("Not yet implemented")
    }

    override suspend fun getByCategory(categoryId: String): Result<List<TaskModel>> {
        TODO("Not yet implemented")
    }

}