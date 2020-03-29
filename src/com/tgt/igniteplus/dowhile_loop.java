package com.tgt.igniteplus;

//The program below calculates the sum of numbers entered by the user until user enters 0

import java.util.Scanner;
public class dowhile_loop {

    public static void main(String[] args) {

            Double number, sum = 0.0;
            Scanner input = new Scanner(System.in);

            do {
                System.out.print("Enter a number: ");
                number = input.nextDouble();
                sum += number;
            } while (number != 0.0);

            System.out.println("Sum = " + sum);
        }
    }

// input = 23,12,-28,0.0
//output = 7