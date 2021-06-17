package br.com.suellencolangelo.todolist.data.datasource

import br.com.suellencolangelo.todolist.data.database.entity.TaskEntity
import br.com.suellencolangelo.todolist.domain.model.TaskModel
import javax.inject.Inject

interface TaskLocalDataSource {
    suspend fun save(task: TaskEntity): Result<Unit>
    suspend fun delete(task: TaskEntity): Result<Unit>
    suspend fun getTask(taskId: String): Result<TaskModel>
    suspend fun getAllTasks(): Result<List<TaskEntity>>
    suspend fun getTasksByCategory(categoryId: String): Result<List<TaskEntity>>
}

class TaskLocalDataSourceImpl @Inject constructor() : TaskLocalDataSource {

    override suspend fun save(task: TaskEntity): Result<Unit> {
        TODO("Not yet implemented")
    }

    override suspend fun delete(task: TaskEntity): Result<Unit> {
        TODO("Not yet implemented")
    }

    override suspend fun getTask(taskId: String): Result<TaskModel> {
        TODO("Not yet implemented")
    }

    override suspend fun getAllTasks(): Result<List<TaskEntity>> {
        TODO("Not yet implemented")
    }

    override suspend fun getTasksByCategory(categoryId: String): Result<List<TaskEntity>> {
        TODO("Not yet implemented")
    }

}