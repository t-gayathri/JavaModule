package com.java.concepts;

public class StringMethods1 {
    public static void main(String[] args) {
        String name = "Pooja";
        String name1 = "Hemali";
        String name2 = "Laksmi";

        for(int i=0; i<name.length();i++){
            System.out.println(name.charAt(i) + " ");
        }

        System.out.println();

        if(name.equals(name1)){
            System.out.println("Names are equal");
        }else{
            System.out.println("Names are not equal");
        }

        if(name.compareTo(name2) > 0){
            System.out.println("name > name2");
        }else{
            System.out.println("name <= name2");
        }
    }
}
