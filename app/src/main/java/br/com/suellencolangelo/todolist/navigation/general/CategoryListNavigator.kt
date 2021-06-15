package br.com.suellencolangelo.todolist.navigation.general

import androidx.fragment.app.Fragment

interface CategoryListNavigator {
    fun navigateToCategoryDetail(fragment: Fragment, categoryId: String)
}