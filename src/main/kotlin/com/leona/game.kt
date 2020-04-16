package com.leona

import java.util.*
import kotlin.random.Random

fun main(args: Array<String>) {
    val secret = Random.nextInt(10) + 1
    println(secret)
    var number = 0
    while ( number != secret) {
        val scanner = Scanner(System.`in`)
        print("Please input a number :")
        number = scanner.nextInt()
        if (number > secret){
            println("Lower")
        }else if (number < secret) {
            println("Higher")
        }else {
            println("Bingo , the number is $number")
        }
    }
}