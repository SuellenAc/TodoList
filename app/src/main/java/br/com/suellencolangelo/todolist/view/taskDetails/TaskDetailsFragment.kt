package br.com.suellencolangelo.todolist.view.taskDetails

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import br.com.suellencolangelo.todolist.databinding.TaskDetailsFragmentBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class TaskDetailsFragment : Fragment() {

    private lateinit var binding: TaskDetailsFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return TaskDetailsFragmentBinding.inflate(inflater).also {
            this.binding = it

        }.root
    }
}
