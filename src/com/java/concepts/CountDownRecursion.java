package com.java.concepts;

public class CountDownRecursion {
    public static void main(String[] args) {
        countDownFrom(5);
    }

    public static void countDownFrom(int num){
        if(num >= 0){
            System.out.println(num);
            countDownFrom(num - 1);
        }
    }
}
