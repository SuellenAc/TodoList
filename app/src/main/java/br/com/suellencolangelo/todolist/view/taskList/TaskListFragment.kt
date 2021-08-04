package br.com.suellencolangelo.todolist.view.taskList

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.fragment.app.Fragment
import br.com.suellencolangelo.todolist.R
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
            this.binding.composeView.setContent {
                Column {
                    ToolBar()
                    TaskList()
                }
            }
        }.root
    }

    @Composable
    fun ToolBar() {
        TopAppBar(
            title = { Text(text = stringResource(R.string.app_name)) },
            navigationIcon = {
                IconButton(
                    onClick = {},
                    content = {
                        Icon(
                            imageVector = Icons.Filled.Menu,
                            tint = Color.White,
                            contentDescription = getString(R.string.drawer_content_description)
                        )
                    },
                    modifier = Modifier.padding(start = 16.dp)
                )
            },
        )
    }

    @Composable
    fun TaskList() {
        val list = listOf(1, 2, 3, 4)
        LazyColumn {
            items(list) {
                Column(
                    Modifier
                        .padding(all = 16.dp)
                        .fillMaxWidth()
                ) {
                    Text(text = "Compose View")
                }
            }
        }
    }

    @Preview(showBackground = true)
    @Composable
    fun Preview() {
        Column {
            ToolBar()
            TaskList()
        }
    }
}
