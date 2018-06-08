package com.example

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController


fun main(args: Array<String>) {
    SpringApplication.run(KotlinSpringApplication::class.java, *args)
}

@SpringBootApplication
@RestController   // for API
open class KotlinSpringApplication {

    @RequestMapping("/")
    fun index() = "<h1>Hello from Kotlin + Spring Boot</h1><a href='/test?name=pvc'>query</a>"

    @RequestMapping("/test")
    fun test(
            @RequestParam(value = "name", defaultValue = "default")
            name: String)
            = "name =  $name"

}