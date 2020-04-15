package com.leona.student;

import java.util.Scanner;

public class SchoolRunner {
    public static void main(String[] args) {
//        userInput();
        Student stu = new Student("Leona", 88, 90);
        stu.print();
//        System.out.println("The Most High score is " + stu.highest());
    }

    private static void userInput() {
        System.out.print("Please input student's name :");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.print("Please input student's English :");
        int english = scanner.nextInt();
        System.out.print("Please input student's Math :");
        int math = scanner.nextInt();
//        Student stu = new Student(name, english, math);
//        stu.print();
//        System.out.println("The Most High score is " + stu.highest());
    }
}
