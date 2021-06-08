package br.com.suellencolangelo.todolist.view.todoDetails

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import br.com.suellencolangelo.todolist.databinding.TodoDetailsFragmentBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class TodoDetailsFragment : Fragment() {

    private lateinit var binding: TodoDetailsFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return TodoDetailsFragmentBinding.inflate(inflater).also {
            this.binding = it

        }.root
    }
}
