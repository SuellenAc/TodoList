package br.com.suellencolangelo.todolist.domain.usecase.category

import br.com.suellencolangelo.todolist.domain.model.CategoryModel
import javax.inject.Inject

interface GetCategoryUseCase {
    suspend fun getCategory(categoryId: String): Result<CategoryModel>
    suspend fun getAll(): Result<List<CategoryModel>>
}

class GetCategoryUseCaseImpl @Inject constructor() : GetCategoryUseCase {

    override suspend fun getCategory(categoryId: String): Result<CategoryModel> {
        TODO("Not yet implemented")
    }

    override suspend fun getAll(): Result<List<CategoryModel>> {
        TODO("Not yet implemented")
    }

}