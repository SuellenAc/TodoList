package br.com.suellencolangelo.todolist.view.taskList

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import br.com.suellencolangelo.todolist.databinding.TaskListItemBinding
import br.com.suellencolangelo.todolist.view.taskList.model.TaskUiModel

class TaskListAdapter(
    private val taskClickListener: (TaskUiModel) -> Unit
) : ListAdapter<TaskUiModel, TaskListAdapter.TaskViewHolder>(TaskDiffCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TaskViewHolder {
        val binding = TaskListItemBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return TaskViewHolder(binding, taskClickListener)
    }

    override fun onBindViewHolder(holder: TaskViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    class TaskViewHolder(
        private val binding: TaskListItemBinding,
        private val taskClickListener: (TaskUiModel) -> Unit,
    ) : RecyclerView.ViewHolder(binding.root) {

        fun bind(task: TaskUiModel) {
            binding.taskTitle.text = task.title
            binding.taskDescription.text = task.description
            binding.root.setOnClickListener {
                taskClickListener.invoke(task)
            }
        }
    }
}

class TaskDiffCallback : DiffUtil.ItemCallback<TaskUiModel>() {

    override fun areItemsTheSame(oldItem: TaskUiModel, newItem: TaskUiModel): Boolean {
        return oldItem == newItem
    }

    override fun areContentsTheSame(oldItem: TaskUiModel, newItem: TaskUiModel): Boolean {
        return oldItem == newItem
    }
}
