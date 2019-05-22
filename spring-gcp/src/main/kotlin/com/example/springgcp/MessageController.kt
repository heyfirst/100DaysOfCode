package com.example.springgcp

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

data class Message(
    val text: String,
    val priority: String,
    var test: Int
)

@RestController
class MessageController {
    @RequestMapping("/message")
    fun message(): Message {
        return Message("Hello from Google Cloud", "High",123456)
    }
}