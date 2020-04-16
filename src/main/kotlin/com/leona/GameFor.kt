package com.leona

import java.util.*

fun main(args: Array<String>) {
    val secret = Random().nextInt(10)+1
    println(secret)
    val scanner = Scanner(System.`in`)
    for (i in 1..4){ //i from 1 to 4
        print("Please input a number: (${i}/4)")
        var number = scanner.nextInt()
        println("第${i}次$number")
        if (number > secret){
            println("Lower")
        }else if (number < secret) {
            println("Higher")
        }else{
            println("Bingo, the number is : $number")
            break
        }
    }
}