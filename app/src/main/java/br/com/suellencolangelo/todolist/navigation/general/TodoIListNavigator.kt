package br.com.suellencolangelo.todolist.navigation.general

import androidx.fragment.app.Fragment

interface TodoIListNavigator {
    fun navigateToDetailItem(fragment: Fragment, todoItemId: String)
}