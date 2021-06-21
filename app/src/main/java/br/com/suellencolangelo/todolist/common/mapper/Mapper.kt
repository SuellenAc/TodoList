package br.com.suellencolangelo.todolist.common.mapper

interface Mapper<F, T> {
    fun map(from: F): T
}