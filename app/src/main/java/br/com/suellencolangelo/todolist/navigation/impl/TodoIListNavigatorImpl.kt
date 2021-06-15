package br.com.suellencolangelo.todolist.navigation.impl

import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import br.com.suellencolangelo.todolist.navigation.general.TodoIListNavigator
import br.com.suellencolangelo.todolist.view.todoList.TodoListFragmentDirections
import javax.inject.Inject

class TodoIListNavigatorImpl @Inject constructor() : TodoIListNavigator {

    override fun navigateToDetailItem(fragment: Fragment, todoItemId: String) {
        val action = TodoListFragmentDirections.toTodoDetailsFragment(todoItemId)
        fragment.findNavController().navigate(action)
    }
}