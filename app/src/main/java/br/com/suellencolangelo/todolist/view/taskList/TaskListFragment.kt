package br.com.suellencolangelo.todolist.view.taskList

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import br.com.suellencolangelo.todolist.databinding.TaskListFragmentBinding
import br.com.suellencolangelo.todolist.navigation.general.TaskListNavigator
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class TaskListFragment : Fragment() {

    private lateinit var binding: TaskListFragmentBinding

    @Inject
    lateinit var taskListNavigator: TaskListNavigator

    private val adapter by lazy {
        TaskListAdapter {
            taskListNavigator.navigateToDetailItem(this, it.id)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return TaskListFragmentBinding.inflate(inflater).also {
            this.binding = it
            configureList()
        }.root
    }

    private fun configureList() {
        binding.taskList.layoutManager = LinearLayoutManager(requireContext())
        binding.taskList.adapter = adapter
    }
}
