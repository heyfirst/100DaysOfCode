package com.ks.todomanagementservice.repositories

import com.ks.todomanagementservice.entities.TodoItem
import org.springframework.data.jpa.repository.JpaRepository

interface TodoItemRepo : JpaRepository<TodoItem, Long>