package com.leona;

public class Hello {
    public static void main(String[] args) {
//        System.out.println("Hello!");
        Person p = new Person();
        p.hello();
        p.weight = 66.5f;
        p.height = 1.7f;
        System.out.println(p.bmi());

        int score = 88;
        System.out.println(score > 60);
    }
}
