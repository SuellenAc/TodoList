package br.com.suellencolangelo.todolist.view.categoryList

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import br.com.suellencolangelo.todolist.databinding.CategoryListFragmentBinding
import br.com.suellencolangelo.todolist.navigation.general.CategoryListNavigator
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class CategoryListFragment : Fragment() {

    private lateinit var binding: CategoryListFragmentBinding

    @Inject
    lateinit var categoryListNavigator: CategoryListNavigator

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return CategoryListFragmentBinding.inflate(inflater).also {
            this.binding = it
            it.text.setOnClickListener {
                categoryListNavigator.navigateToCategoryDetail(
                    this,
                    "dummyId"
                )
            }
        }.root
    }
}
