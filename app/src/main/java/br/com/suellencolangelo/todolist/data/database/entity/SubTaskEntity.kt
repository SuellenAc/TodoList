package br.com.suellencolangelo.todolist.data.database.entity

data class SubTaskEntity(
    val id: String,
    val title: String,
    val description: String,
    val isCompleted: Boolean,
)