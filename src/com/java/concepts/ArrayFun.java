package com.java.concepts;

public class ArrayFun {
    public static void main(String[] args) {
        int[] myArray;
        myArray = new int[5];

        myArray[0] = 10;
        myArray[1] = 12;
        myArray[2] = 30;
        myArray[3] = 22;
        myArray[4] = 50;

        for (int i=0; i< myArray.length; i++){
            System.out.println(myArray[i]);
        }

        System.out.println("-----------------");

        //enhanced for loop
        for(int num : myArray){
            System.out.println(num);
        }
    }
}
