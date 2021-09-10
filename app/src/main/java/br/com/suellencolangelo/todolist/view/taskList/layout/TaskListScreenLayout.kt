package br.com.suellencolangelo.todolist.view.taskList

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import br.com.suellencolangelo.todolist.R
import br.com.suellencolangelo.todolist.view.taskList.model.TaskCategoryUiModel
import br.com.suellencolangelo.todolist.view.taskList.model.TaskUiModel

@Composable
fun TaskListScreen(){
    Column {
        ToolBar()
        TaskList()
    }
}

@Composable
fun ToolBar() {
    TopAppBar(title = { Text(text = stringResource(R.string.app_name)) })
}

@Composable
fun TaskList(tasks: List<TaskUiModel> = listOf()) {
    val list = listOf(
        TaskUiModel(
            id = "teste",
            title = "Title",
            description = "Description",
            isCompleted = false,
            isArchived = false,
            category = TaskCategoryUiModel("teste", "")
        )
    )
    LazyColumn {
        items(list) { item ->
            TaskItem(item)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Preview() {
    TaskListScreen()
}