package br.com.suellencolangelo.todolist.domain.usecase.subtask

import br.com.suellencolangelo.todolist.domain.model.SubTaskModel
import javax.inject.Inject

interface SaveSubTaskUseCase {
    suspend fun save(subTask: SubTaskModel): Result<Unit>
}

class SaveSubTaskUseCaseImpl @Inject constructor() : SaveSubTaskUseCase {

    override suspend fun save(subTask: SubTaskModel): Result<Unit> {
        TODO("Not yet implemented")
    }

}