package com.leona;

public class Person {
    String name;
    float weight;
    float height;

    public Person(){
      //建構子
    }

    public float bmi(){
        float bmi = weight / (height*height);
        return bmi;
    }

    public void hello() {
        System.out.println("Hello World !!");
    }
}
