package com.example.hello_world

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController


@RestController
class MessageController {
    @GetMapping("/")
    fun listMessages() = listOf<Message>(
        Message("1" , "hello"),
        Message("2" , "Bonjour"),
        Message("3" , "Privet ! "),

    )

}