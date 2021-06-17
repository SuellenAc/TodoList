package br.com.suellencolangelo.todolist.navigation.impl

import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import br.com.suellencolangelo.todolist.navigation.general.TaskListNavigator
import br.com.suellencolangelo.todolist.view.taskList.TaskListFragmentDirections
import javax.inject.Inject

class TaskListNavigatorImpl @Inject constructor() : TaskListNavigator {

    override fun navigateToDetailItem(fragment: Fragment, taskItemId: String) {
        val action = TaskListFragmentDirections.toTaskDetailsFragment(taskItemId)
        fragment.findNavController().navigate(action)
    }
}