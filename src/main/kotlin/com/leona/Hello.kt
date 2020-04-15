package com.leona

import javafx.scene.text.FontWeight

fun main(args: Array<String>) {
    var s : String? = "abcde"
//    s = null
    println(s?.length)
    println(s?.get(3))

//    Human().hello();
    val h = Human(66.5f,1.7f)
    println(h.bmi())
    val score = 88
    println(score > 60)

    val c :Char = 'A'
    println(c.toInt() > 60)
}

class Human(var weight: Float, var height:Float) {

    init {
        println("test $weight" )
    }

    fun bmi() : Float{
        val bmi = weight / (height*height)
        return bmi
    }

    fun hello(){
        println("Hello kotlin !!")
    }
}