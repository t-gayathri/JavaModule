package com.java.concepts;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] somevalue = new int[5];

        for (int i=0; i<somevalue.length; i++){
            System.out.println("enter an integer\t");
            somevalue[i] = sc.nextInt();
        }

        for(int i=0; i< somevalue.length ; i++){
            int result = somevalue[i] * 2;
            System.out.println("THe result is "+result);

        }
    }
}
