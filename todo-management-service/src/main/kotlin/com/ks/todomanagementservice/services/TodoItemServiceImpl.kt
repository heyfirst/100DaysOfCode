package com.ks.todomanagementservice.services

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import com.ks.todomanagementservice.entities.TodoItem
import com.ks.todomanagementservice.exceptions.NotFoundException
import com.ks.todomanagementservice.repositories.TodoItemRepo
import com.ks.todomanagementservice.repositories.TodoRepo
import org.springframework.data.repository.findByIdOrNull

@Service
class TodoItemServiceImpl @Autowired constructor(val todoRepo: TodoRepo,
                                                 val todoItemRepo: TodoItemRepo) : TodoItemService {
    override fun createTodoItem(todoId: Long, todoItem: TodoItem): TodoItem {
        val todo = todoRepo.findByIdOrNull(todoId) ?: throw NotFoundException("No Todo with id $todoId")
        todoItem.todo = todo
        return todoItemRepo.saveAndFlush(todoItem)
    }

    override fun updateTodoItem(id: Long, todoItem: TodoItem): TodoItem {
        val result = todoItemRepo.findByIdOrNull(id) ?: throw NotFoundException("No TodoItem with id $id")
        result.content = todoItem.content
        result.complete = todoItem.complete
        return todoItemRepo.saveAndFlush(result)
    }

    override fun deleteTodoItem(id: Long): TodoItem {
        val result = todoItemRepo.findByIdOrNull(id) ?: throw NotFoundException("No TodoItem with id $id")
        todoItemRepo.delete(result)
        return result
    }
}