package com.java.concepts;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FileInputFun {
    public static void main(String[] args) {
        Scanner infile;
        try{
            infile = new Scanner(new File("input.txt"));
            int input;

            while(infile.hasNext()){
                input = infile.nextInt();
                System.out.println(input);
            }
            infile.close();
        }catch(FileNotFoundException exception){
            System.out.println("Can't find the file");
            System.out.println(exception.getMessage());
        }catch(InputMismatchException e){
            System.out.println("error reading a file");
        }
    }
}
