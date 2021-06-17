package br.com.suellencolangelo.todolist.domain.usecase.subtask

import br.com.suellencolangelo.todolist.domain.model.SubTaskModel
import javax.inject.Inject

interface GetSubTaskUseCase {
    suspend fun getSubTask(Id: String): Result<SubTaskModel>
    suspend fun getByTask(taskId: String): Result<List<SubTaskModel>>
}

class GetSubTaskUseCaseImpl @Inject constructor() : GetSubTaskUseCase {

    override suspend fun getSubTask(Id: String): Result<SubTaskModel> {
        TODO("Not yet implemented")
    }

    override suspend fun getByTask(taskId: String): Result<List<SubTaskModel>> {
        TODO("Not yet implemented")
    }

}