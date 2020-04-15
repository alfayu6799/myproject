package com.leona.student;

public class Student {
    String id;
    String name;
    int english;
    int math;

    public Student(String name, int english, int math) {
        this.name = name;
        this.english = english;
        this.math = math;
    }

    public int highest(){
        return (english > math) ? english : math;
    }

    public void print(){
        int average = getAverage();
        System.out.println(name + "\t" + english + "\t" + math +
                "\t" + getAverage() +"\t" +
                ((getAverage() > 60) ? "PASS" : "FAILED"));

//        if (getAverage() > 60){
//            System.out.println("\tPASS");
//        }else{
//            System.out.println("\tFailed");
//        }
    }

    public int getAverage() {
        return (english+math)/2;
    }
}
