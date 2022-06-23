package com.java.concepts;

import java.util.ArrayList;

public class WrapperFun {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(12);
        al.add(10);
        for(int i = 0; i<al.size();i++){
            System.out.println(al.get(i));
        }

        String somevalue = "239";
        int numericValue = Integer.parseInt(somevalue);
        System.out.println(numericValue);

        String doublevalue = "3.2897";
        double dvalue = Double.parseDouble(doublevalue);
        System.out.println(dvalue);
    }
}
