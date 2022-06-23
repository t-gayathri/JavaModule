package com.java.concepts;

public class SquareMethodFunc {
    public static void main(String[] args) {
        double square = squareOfANumber(4.56);
        System.out.println(square);
    }

    public static double squareOfANumber(double number){
        return number * number;
    }
}
