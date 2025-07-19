package com.example.hello_world

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController


@RestController
class HelloWorldController {
    @GetMapping("/")
    fun index(@RequestParam("name") name :String) = "Hello , $name!"

}