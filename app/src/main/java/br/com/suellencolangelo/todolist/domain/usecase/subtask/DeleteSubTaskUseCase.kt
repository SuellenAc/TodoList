package br.com.suellencolangelo.todolist.domain.usecase.subtask

import br.com.suellencolangelo.todolist.domain.model.SubTaskModel
import javax.inject.Inject

interface DeleteSubTaskUseCase {
    suspend fun delete(subTask: SubTaskModel): Result<Unit>
}

class DeleteSubTaskUseCaseImpl @Inject constructor() : DeleteSubTaskUseCase {

    override suspend fun delete(subTask: SubTaskModel): Result<Unit> {
        TODO("Not yet implemented")
    }

}