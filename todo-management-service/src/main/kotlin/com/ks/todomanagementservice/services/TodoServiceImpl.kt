package com.ks.todomanagementservice.services

import com.ks.todomanagementservice.entities.Todo
import com.ks.todomanagementservice.exceptions.NotFoundException
import com.ks.todomanagementservice.repositories.TodoRepo
import org.springframework.data.repository.findByIdOrNull

import org.springframework.stereotype.Service

@Service
class TodoServiceImpl(val todoRepo: TodoRepo) : TodoService {
    init {
        println("I'm TodoServiceImpl")
    }

    override fun createTodo(todo: Todo): Todo {
        return todoRepo.saveAndFlush(todo)
    }

    override fun getTodo(id: Long): Todo {
        return todoRepo.findByIdOrNull(id) ?: throw NotFoundException("No Todo with id $id")
    }

    override fun getTodoList(): List<Todo> {
        return todoRepo.findAll()
    }

    override fun updateTodo(id: Long, todo: Todo): Todo {
        val result = todoRepo.findByIdOrNull(id) ?: throw NotFoundException("No Todo with id $id")
        result.title = todo.title
        return todoRepo.saveAndFlush(result)
    }

    override fun deleteTodo(id: Long): Todo {
        val result = todoRepo.findByIdOrNull(id) ?: throw NotFoundException("No Todo with id $id")
        todoRepo.delete(result)
        return result
    }
}