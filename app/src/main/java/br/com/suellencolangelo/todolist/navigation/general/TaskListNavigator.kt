package br.com.suellencolangelo.todolist.navigation.general

import androidx.fragment.app.Fragment

interface TaskListNavigator {
    fun navigateToDetailItem(fragment: Fragment, taskItemId: String)
}