package com.java.concepts;

//same method name but different parameters
public class MethodOverloading {
    public static void main(String[] args) {
        System.out.println(getResult(5));
        System.out.println(getResult(3,2));
        System.out.println(getResult(4,"30"));
    }

    public static int getResult(int num){
        return num*2;
    }

    public static int getResult(int num1, int num2){
        return num1*num2;
    }

    public static int getResult(int num, String str){
        return num * Integer.parseInt(str);
    }
}
