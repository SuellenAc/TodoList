package br.com.suellencolangelo.todolist.navigation.impl

import androidx.fragment.app.Fragment
import br.com.suellencolangelo.todolist.navigation.general.CategoryListNavigator
import javax.inject.Inject

class CategoryListNavigatorImpl @Inject constructor() : CategoryListNavigator {

    override fun navigateToCategoryDetail(fragment: Fragment, categoryId: String) {
//        val action = CategoryListFragmentDirections.toCategoryDetailsFragment(categoryId)
//        fragment.findNavController().navigate(action)
    }

}