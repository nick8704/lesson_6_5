package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("Enter any number: ");
        Scanner input = new Scanner(System.in);
        double number = input.nextDouble();
        System.out.print("Enter degree of the number (integer and positive): ");
        int degree = input.nextInt();
        degree(number, degree);
    }

    private static void degree(double number, int degree) {
        double newNumber = Math.pow(number, degree);
        Random random = new Random();
        int probability = random.nextInt(99);
        if (probability <= 79) {
            System.out.println("Degree of the number " + number + " is " + newNumber);
        } else {
            System.out.println("Я не знаю");
        }
    }
}