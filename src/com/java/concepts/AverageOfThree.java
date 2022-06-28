package com.java.concepts;

import java.util.Scanner;

public class AverageOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1;
        double num2;
        double num3;
        double average;

        System.out.println("Enter Three numbers");
        num1 = sc.nextDouble();
        num2 = sc.nextDouble();
        num3 = sc.nextDouble();

        average = (num1+num2+num3)/2;
        System.out.println(average);
    }
}
