package com.leona.parking;

import javafx.scene.input.DataFormat;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class Tester {
    public static void main(String[] args) {
        LocalDateTime enter =
                LocalDateTime.of(2020,4,16,8,0,0);
        LocalDateTime leave =
                LocalDateTime.of(2020,4,16, 10,8,0);
        Car car = new Car ("AA-001", enter); //Car 進場時間
        car.setLeave(leave); //car出場時間
        System.out.println(car.getDuration()); //停車總時間
//        long hours = car.getDuration() / 60; //無法進位(bug)
        long hours = (long) Math.ceil(car.getDuration()/60.0);
        System.out.println("停車時數 = " + hours);
        System.out.println("停車費用($30/@) = NT$"+ 30 * hours);
        //java8();
        //java();
    }

    private static void java8() {
        Instant instant = Instant.now(); //現在時間
        System.out.println(instant);
        //local
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        System.out.println(dateTimeFormatter.format(now));
    }

    private static void java() {
        Date date = new Date();
        System.out.println(date);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        System.out.println(sdf.format(date));

        //Calender練習
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getTime());
    }
}
