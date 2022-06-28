package com.java.concepts;

import java.util.Scanner;

public class NamePraser {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String fullname;
        String firstname;
        String lastname = null;
        System.out.println("Enter your full name please");
        fullname = keyboard.nextLine();

        int indexOfSpace = fullname.indexOf(" ");

        firstname = fullname.substring(0, indexOfSpace);
        lastname = fullname.substring(indexOfSpace + 1);

        System.out.println(firstname.toUpperCase() + " " + lastname.toUpperCase());
    }
}
