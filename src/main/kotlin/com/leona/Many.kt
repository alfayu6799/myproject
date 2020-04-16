package com.leona

fun main(args: Array<String>) {
    val list = listOf(5,1,2,7)
    println(list)
    val scores = listOf(77,98,45,34,67)
    for (score in scores){
        println(score)
    }

    var mutableList = mutableListOf(5,1,2,7)
    mutableList.add(6)
    println(mutableList)
}