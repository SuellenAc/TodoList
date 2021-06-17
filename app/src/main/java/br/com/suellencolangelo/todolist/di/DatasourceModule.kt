package br.com.suellencolangelo.todolist.di

import br.com.suellencolangelo.todolist.data.datasource.TaskLocalDataSource
import br.com.suellencolangelo.todolist.data.datasource.TaskLocalDataSourceImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

@Module
@InstallIn(ActivityComponent::class)
abstract class DatasourceModule {

    @Binds
    abstract fun bindTaskLocalDataSource(datasource: TaskLocalDataSourceImpl): TaskLocalDataSource

}