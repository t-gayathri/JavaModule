package com.java.concepts;

import java.util.Locale;

public class StringMethods2 {
    public static void main(String[] args) {
        String name ="John";
        String name1 = "Hari";

        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());

        System.out.println(name.indexOf('h'));

        System.out.println(name.substring(4));
        System.out.println(name.substring(1,3));
    }
}
