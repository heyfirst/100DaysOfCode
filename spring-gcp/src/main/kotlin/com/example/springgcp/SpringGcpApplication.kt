package com.example.springgcp

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer

@SpringBootApplication
class SpringGcpApplication: SpringBootServletInitializer()

fun main(args: Array<String>) {
	runApplication<SpringGcpApplication>(*args)
}
