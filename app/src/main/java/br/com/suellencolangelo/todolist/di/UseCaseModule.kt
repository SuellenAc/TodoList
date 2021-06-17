package br.com.suellencolangelo.todolist.di

import br.com.suellencolangelo.todolist.domain.usecase.category.*
import br.com.suellencolangelo.todolist.domain.usecase.subtask.*
import br.com.suellencolangelo.todolist.domain.usecase.task.*
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
abstract class UseCaseModule {

    @Binds
    abstract fun bindDeleteCategoryUseCase(
        useCase: DeleteCategoryUseCaseImpl
    ): DeleteCategoryUseCase

    @Binds
    abstract fun bindDeleteTaskUseCase(useCase: DeleteTaskUseCaseImpl): DeleteTaskUseCase

    @Binds
    abstract fun bindDeleteSubTaskUseCase(useCase: DeleteSubTaskUseCaseImpl): DeleteSubTaskUseCase

    @Binds
    abstract fun bindGetCategoryUseCase(
        useCase: GetCategoryUseCaseImpl
    ): GetCategoryUseCase

    @Binds
    abstract fun bindGetTaskUseCase(useCase: GetTaskUseCaseImpl): GetTaskUseCase

    @Binds
    abstract fun bindGetSubTaskUseCase(useCase: GetSubTaskUseCaseImpl): GetSubTaskUseCase

    @Binds
    abstract fun bindSaveCategoryUseCase(
        useCase: SaveCategoryUseCaseImpl
    ): SaveCategoryUseCase

    @Binds
    abstract fun bindSaveTaskUseCase(useCase: SaveTaskUseCaseImpl): SaveTaskUseCase

    @Binds
    abstract fun bindSaveSubTaskUseCase(useCase: SaveSubTaskUseCaseImpl): SaveSubTaskUseCase

}