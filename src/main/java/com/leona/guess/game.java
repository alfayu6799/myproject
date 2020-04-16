package com.leona.guess;

import javax.jws.soap.SOAPBinding;
import java.util.Random;
import java.util.Scanner;

public class game {
    public static void main(String[] args) {
        Random random = new Random();
        int secret = random.nextInt(10)+1; //1-10
        System.out.println(secret); //正確數字
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        while (number != secret){
            System.out.print("Please input a number : ");
            number = scanner.nextInt();
            if (number < secret){
                System.out.println("Higher");
            } else if (number > secret){
                System.out.println("Lower");
            }else{
                System.out.println("Bingo , The number is " + number);
            }
        }

    }
}
