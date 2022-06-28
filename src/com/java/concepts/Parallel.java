package com.java.concepts;

import java.util.ArrayList;
import java.util.Scanner;

public class Parallel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> ages = new ArrayList<>();

        String name;
        int age;

        for(int i=0; i<=5 ; i++){
            System.out.print("Enter a name:\t");
            name = sc.nextLine();
            System.out.print("Enter an age:\t");
            age = sc.nextInt();

            sc.nextInt();

            names.add(name);
            ages.add(age);
            System.out.println();
        }

        for(int i=0; i<names.size(); i++){
            System.out.println(names.get(i) + "is" +ages.get(i) + "years old");
        }

    }
}
