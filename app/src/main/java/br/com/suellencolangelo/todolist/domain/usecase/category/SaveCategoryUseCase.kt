package br.com.suellencolangelo.todolist.domain.usecase.category

import br.com.suellencolangelo.todolist.domain.model.CategoryModel
import javax.inject.Inject

interface SaveCategoryUseCase {
    suspend fun save(category: CategoryModel): Result<Unit>
}

class SaveCategoryUseCaseImpl @Inject constructor() : SaveCategoryUseCase {

    override suspend fun save(category: CategoryModel): Result<Unit> {
        TODO("Not yet implemented")
    }

}