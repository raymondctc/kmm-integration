package com.existing.example.module_core

class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}