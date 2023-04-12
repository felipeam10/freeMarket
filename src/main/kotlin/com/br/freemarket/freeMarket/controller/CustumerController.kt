package com.br.freemarket.freeMarket.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class CustumerController {

    @GetMapping
    fun helloWorld(): String {
        return "Hello World do Controller"
    }
}