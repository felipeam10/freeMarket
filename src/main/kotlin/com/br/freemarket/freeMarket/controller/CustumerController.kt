package com.br.freemarket.freeMarket.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("customer")
class CustumerController {

    @GetMapping
    fun helloWorld(): String {
        return "Hello World do Controller com customer"
    }

    @GetMapping("/2")
    fun customer(): String {
        return "Hello World do Controller com customer 2"
    }
}