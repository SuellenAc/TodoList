package br.com.suellencolangelo.todolist.di

import br.com.suellencolangelo.todolist.navigation.general.CategoryListNavigator
import br.com.suellencolangelo.todolist.navigation.general.TaskListNavigator
import br.com.suellencolangelo.todolist.navigation.impl.CategoryListNavigatorImpl
import br.com.suellencolangelo.todolist.navigation.impl.TaskListNavigatorImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.FragmentComponent

@Module
@InstallIn(FragmentComponent::class)
abstract class NavigationModule {

    @Binds
    abstract fun bindTodoItemNavigator(navigator: TaskListNavigatorImpl): TaskListNavigator

    @Binds
    abstract fun bindCategoryListNavigator(navigator: CategoryListNavigatorImpl): CategoryListNavigator

}