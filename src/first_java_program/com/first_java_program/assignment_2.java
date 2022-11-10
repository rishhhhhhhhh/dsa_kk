package com.first_java_program;

//Take name as input and print a greeting message for that particular name.

import java.util.Scanner;

public class assignment_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter your name:");
        String name = scan.next();
        System.out.println("hello "+name+", may you have a nice day!");
        scan.close();    
    }
    
}