package com.leona.student

import java.util.*

fun main(args: Array<String>) {
//    userInput()
    val stu = Students("Leona", 60, 88)
    stu.print()
    println("Hight Score : ${stu.hightest()}")
}

class Students(var name:String, var english:Int , var math:Int) {
    fun print(){
       println("$name\t$english\t$math\t${getAverage()}\t${passOrFailed()}\t${graing()}")
    }

    fun passOrFailed() = if(getAverage() >= 60 ) "PASS" else "FAILED"

    fun graing() = when(getAverage()){
        in 90..100 ->'A'
        in 80..89 ->'B'
        in 70..79 ->'C'
        in 60..69 ->'D'
        else ->'F'
    }

    //回傳int值
    fun hightest( ) : Int {
        var max = if (english > math) english else math
        return max
    }

    fun getAverage() = (english + math) /2
}

private fun userInput() {
    val scanner = Scanner(System.`in`)
    print("Please input student's name:")
    var name = scanner.next()
    print("Please input student's English:")
    var english = scanner.nextInt()
    print("Please input student's Math:")
    var math = scanner.nextInt()
    val stu = Student(name, english, math)
    stu.print()
}

