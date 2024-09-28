package com.example.mocksmartbandservice

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController


@RestController
class Hello {
    
    @GetMapping("/hello")
    fun hello(): String = "Hello world!"
}
