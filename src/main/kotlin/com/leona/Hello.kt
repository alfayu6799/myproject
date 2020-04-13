package com.leona

fun main(args: Array<String>) {
//    Human().hello();
    val h = Human();
    h.hello();
}

class Human {
    fun hello(){
        println("Hello kotlin !!")
    }
}