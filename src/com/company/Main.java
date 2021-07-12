package com.company;
import java.util.Scanner;
public class Main {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static void main(String[] args) {

        System.out.println(ANSI_BLUE+" " + (char)40 + (char)92 + (char)47 + (char)41 + "\n " + (char)40 + (char)62 + " " +
                (char)60 + (char)41 + "\n" + (char)99 + (char)40 + (char)34 +
                (char)41 + (char)40 +(char)34 + (char)41+ANSI_RESET);
        System.out.println(ANSI_RED +"\n " + (char)94 + (char)95 + (char)95 +(char)95 + (char)94 + "\n " + (char)40 + (char)39 +
                (char)111 + (char)39 +
                (char)41 + "\n" +  (char)32+(char)40 + (char)117 +
                (char)117 + (char)32 +(char)41+ANSI_RESET);


    }
}


