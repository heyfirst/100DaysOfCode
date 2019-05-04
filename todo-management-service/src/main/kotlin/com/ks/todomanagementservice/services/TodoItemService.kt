package com.ks.todomanagementservice.services

import com.ks.todomanagementservice.entities.TodoItem

interface TodoItemService {
    fun createTodoItem(todoId: Long, todoItem: TodoItem): TodoItem

    fun updateTodoItem(id: Long, todoItem: TodoItem): TodoItem

    fun deleteTodoItem(id: Long): TodoItem
}