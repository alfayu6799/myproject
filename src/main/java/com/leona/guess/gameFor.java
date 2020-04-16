package com.leona.guess;

import java.util.Random;
import java.util.Scanner;

public class gameFor {
    public static void main(String[] args) {
        int secret = new Random().nextInt(10) + 1;
        System.out.println(secret);
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i < 4; i++){
            System.out.print("Please input a number(" + i + "/4):");
            int number = scanner.nextInt();
            System.out.println("第" + i + "次" + number);
            if (number > secret){
                System.out.println("lower");
            }else if (number < secret){
                System.out.println("Higher");
            }else {
                System.out.println("Bingo, The number is :" + number);
                break;
            }
        }
        System.out.println("End");
    }
}
