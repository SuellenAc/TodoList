package br.com.suellencolangelo.todolist.domain.usecase.task

import br.com.suellencolangelo.todolist.domain.model.TaskModel
import javax.inject.Inject

interface DeleteTaskUseCase {
    suspend fun delete(task: TaskModel): Result<Unit>
}

class DeleteTaskUseCaseImpl @Inject constructor() : DeleteTaskUseCase {

    override suspend fun delete(task: TaskModel): Result<Unit> {
        TODO("Not yet implemented")
    }

}