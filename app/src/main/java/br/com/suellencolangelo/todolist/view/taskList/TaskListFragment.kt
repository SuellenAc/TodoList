package br.com.suellencolangelo.todolist.view.taskList

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import br.com.suellencolangelo.todolist.databinding.TaskListFragmentBinding
import br.com.suellencolangelo.todolist.navigation.general.TaskListNavigator
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class TaskListFragment : Fragment() {

    private lateinit var binding: TaskListFragmentBinding

    @Inject
    lateinit var taskListNavigator: TaskListNavigator

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return TaskListFragmentBinding.inflate(inflater).also {
            this.binding = it
            it.root.setOnClickListener { taskListNavigator.navigateToDetailItem(this, "dummyId") }

        }.root
    }
}
