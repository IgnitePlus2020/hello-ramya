package com.tgt.igniteplus;

// Program to find the sum of natural numbers from 1 to 100

public class for_loop {
    public static void main(String[] args) {

        int sum = 0;

        for (int i = 1; i <= 100; ++i) {
            sum = sum + i;
        }

        System.out.println("Sum = " + sum);
    }
}

//output = 5050