package br.com.suellencolangelo.todolist.di

import br.com.suellencolangelo.todolist.data.repository.TaskRepository
import br.com.suellencolangelo.todolist.data.repository.TaskRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

@Module
@InstallIn(ActivityComponent::class)
abstract class RepositoryModule {

    @Binds
    abstract fun bindTaskRepository(repository: TaskRepositoryImpl): TaskRepository

}