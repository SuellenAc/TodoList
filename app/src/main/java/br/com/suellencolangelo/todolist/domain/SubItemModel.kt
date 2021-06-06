package br.com.suellencolangelo.todolist.domain

data class SubItemModel(
    val id: String,
    val title: String,
    val description: String,
    val isCompleted: Boolean,
)