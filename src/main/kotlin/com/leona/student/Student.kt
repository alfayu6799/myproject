package com.leona.student

fun main(args: Array<String>) {
    val stu = Students("Andy", 66, 88)
    stu.print()
}

class Students(var name:String, var english:Int , var math:Int) {
    fun print(){
        print(name + "\t" + english + "\t" + math +
                "\t" + (english+math)/2 )
    }
}