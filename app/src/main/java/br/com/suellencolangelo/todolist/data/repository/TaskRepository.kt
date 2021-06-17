package br.com.suellencolangelo.todolist.data.repository

import br.com.suellencolangelo.todolist.domain.model.TaskModel
import javax.inject.Inject

interface TaskRepository {
    suspend fun save(task: TaskModel): Result<Unit>
    suspend fun delete(task: TaskModel): Result<Unit>
    suspend fun getTask(taskId: String): Result<TaskModel>
    suspend fun getAllTasks(): Result<List<TaskModel>>
    suspend fun getTasksByCategory(categoryId: String): Result<List<TaskModel>>
}

class TaskRepositoryImpl @Inject constructor() : TaskRepository {
    override suspend fun save(task: TaskModel): Result<Unit> {
        TODO("Not yet implemented")
    }

    override suspend fun delete(task: TaskModel): Result<Unit> {
        TODO("Not yet implemented")
    }

    override suspend fun getTask(taskId: String): Result<TaskModel> {
        TODO("Not yet implemented")
    }

    override suspend fun getAllTasks(): Result<List<TaskModel>> {
        TODO("Not yet implemented")
    }

    override suspend fun getTasksByCategory(categoryId: String): Result<List<TaskModel>> {
        TODO("Not yet implemented")
    }

}