package com.example.hello_world

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController


@RestController
class HelloWorldController {
    @GetMapping("/")
    fun helloWorld(): String
    {
        return "hello from firas!!"
    }

}