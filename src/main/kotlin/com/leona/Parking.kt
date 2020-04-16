package com.leona

import java.time.Duration
import java.time.LocalDate
import java.time.LocalDateTime

fun main(args: Array<String>) {
    val enter:LocalDateTime = LocalDateTime.of(2020,4,16,8,0,0)
    val leave:LocalDateTime = LocalDateTime.of(2020,4,16,10,8,0)
    var car = Cars("XYK-897" , enter)
    car.leave = leave
    println(car.duration())
    var hours = Math.ceil(car.duration()/60.0).toLong()
    println("停車時數$hours")
}

class Cars(val id:String, val enter:LocalDateTime){
    var leave:LocalDateTime? = null //出場時間
    set(value) {
        if (enter.isBefore(value))
            field = value    //leave = filed
    }

    fun duration() : Long = Duration.between(enter, leave).toMinutes()
}