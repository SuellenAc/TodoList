package br.com.suellencolangelo.todolist.domain.usecase.task

import br.com.suellencolangelo.todolist.domain.model.TaskModel
import javax.inject.Inject

interface SaveTaskUseCase {
    suspend fun save(task: TaskModel): Result<Unit>
}

class SaveTaskUseCaseImpl @Inject constructor() : SaveTaskUseCase {

    override suspend fun save(task: TaskModel): Result<Unit> {
        TODO("Not yet implemented")
    }

}