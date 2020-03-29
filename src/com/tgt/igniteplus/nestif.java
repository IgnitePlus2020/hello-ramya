package com.tgt.igniteplus;

//Program to demonstrate the use of Nested If Statement

public class nestif {
    public static void main(String[] args) {

        int age = 20;
        int weight = 80;

        if (age >= 18) {
            if (weight > 50) {
                System.out.println("You are eligible to donate blood");
            }
        }

    }
}

//output = You are eligible to donate blood