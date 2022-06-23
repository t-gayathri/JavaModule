package com.java.concepts;

import java.util.ArrayList;

public class ArrayListFun {
    public static void main(String[] args) {
        ArrayList<String> namesList = new ArrayList<>();
        namesList.add("john");
        namesList.add("bob");
        namesList.add("billy");
        namesList.add("tae");
        namesList.add("hope");

        for(int i=0 ; i<namesList.size(); i++){
            System.out.println(namesList.get(i));
        }

        System.out.println("------------");
        for(String names:namesList){
            System.out.println(names);
        }
    }
}
