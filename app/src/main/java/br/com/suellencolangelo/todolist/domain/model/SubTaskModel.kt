package br.com.suellencolangelo.todolist.domain.model

data class SubTaskModel(
    val id: String,
    val title: String,
    val description: String,
    val isCompleted: Boolean,
)