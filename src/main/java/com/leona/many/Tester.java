package com.leona.many;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tester {
    public static void main(String[] args) {
        List<Integer> scores = Arrays.asList(77,98,45,34,67);
        for (int i : scores) {
            System.out.println(i);
        }
        //arrayTest();
    }

    private static void arrayTest() {
        int[] nembers = new int[5]; //五個int's value
        int[] scores = {77,98,45,34,67};
        for (int i : scores) {
            System.out.println(i);
        }
    }
}
