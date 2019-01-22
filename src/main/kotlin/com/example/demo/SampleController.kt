package com.example.demo

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class SampleController {

    @GetMapping("/test")
    fun hello () :String {
        val message = "hello kotlin!"
        return message
    }

}

