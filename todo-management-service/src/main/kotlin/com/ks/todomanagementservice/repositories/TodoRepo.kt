package com.ks.todomanagementservice.repositories

import com.ks.todomanagementservice.entities.Todo
import org.springframework.data.jpa.repository.JpaRepository

interface TodoRepo : JpaRepository<Todo, Long>