package br.com.suellencolangelo.todolist.view.todoList

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import br.com.suellencolangelo.todolist.databinding.TodoListFragmentBinding
import br.com.suellencolangelo.todolist.navigation.general.TodoIListNavigator
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class TodoListFragment : Fragment() {

    private lateinit var binding: TodoListFragmentBinding

    @Inject
    lateinit var todoIListNavigator: TodoIListNavigator

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return TodoListFragmentBinding.inflate(inflater).also {
            this.binding = it
            it.root.setOnClickListener { todoIListNavigator.navigateToDetailItem(this, "dummyId") }

        }.root
    }
}
