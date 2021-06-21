package br.com.suellencolangelo.todolist.view.taskList

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import br.com.suellencolangelo.todolist.domain.usecase.task.GetTaskUseCase
import br.com.suellencolangelo.todolist.view.taskList.mapper.TaskModelToUiModelMapper
import br.com.suellencolangelo.todolist.view.taskList.model.TaskUiModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class TaskListViewModel @Inject constructor(
    private val getTaskUseCase: GetTaskUseCase,
    private val taskToUiModelMapper: TaskModelToUiModelMapper,
) : ViewModel() {

    private val _state = MutableLiveData<State>(State.Loading)
    val state: LiveData<State> = _state

    fun getTasks() = viewModelScope.launch {
        _state.value = State.Loading
        getTaskUseCase.getAll()
            .onSuccess {
                _state.value = State.Success(it.map { task -> taskToUiModelMapper.map(task) })
            }.onFailure {
                _state.value = State.Error
            }
    }

}

sealed class State {
    object Loading : State()
    object Error : State()
    data class Success(val todoList: List<TaskUiModel>) : State()
}