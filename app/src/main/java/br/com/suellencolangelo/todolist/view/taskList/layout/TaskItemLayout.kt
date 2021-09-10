package br.com.suellencolangelo.todolist.view.taskList

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import br.com.suellencolangelo.todolist.view.composeutils.RoundedCornerBoxWithBorder
import br.com.suellencolangelo.todolist.view.composeutils.TextDesignStyle
import br.com.suellencolangelo.todolist.view.taskList.model.TaskUiModel

@Composable
fun TaskItem(task: TaskUiModel) {
    RoundedCornerBoxWithBorder(Modifier.padding(16.dp)) {
        Column(Modifier.fillMaxWidth().padding(8.dp)) {
            Text(
                text = task.title,
                color = Color.White,
                style = TextDesignStyle.Header3,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis
            )
            Text(
                text = task.description,
                color = Color.White,
                style = TextDesignStyle.SubTitle3,
                modifier = Modifier.padding(top = 4.dp),
                maxLines = 3,
                overflow = TextOverflow.Ellipsis
            )
        }
    }
}