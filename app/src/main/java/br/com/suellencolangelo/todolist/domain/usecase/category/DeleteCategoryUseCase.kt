package br.com.suellencolangelo.todolist.domain.usecase.category

import br.com.suellencolangelo.todolist.domain.model.CategoryModel
import javax.inject.Inject

interface DeleteCategoryUseCase {
    suspend fun delete(category: CategoryModel): Result<Unit>
}

class DeleteCategoryUseCaseImpl @Inject constructor() : DeleteCategoryUseCase {

    override suspend fun delete(category: CategoryModel): Result<Unit> {
        TODO("Not yet implemented")
    }

}