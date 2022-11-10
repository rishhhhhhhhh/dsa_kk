package com.first_java_program;

import java.util.Scanner;

// Write a program to input principal, time, and rate (P, T, R) from the user and
// find Simple Interest.

public class assignment_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter principal:");
        float p = scan.nextFloat();
        System.out.print("enter rate:");
        float r = scan.nextFloat();
        System.out.print("enter time period:");
        float t = scan.nextFloat();
        scan.close(); 
        System.out.println("the simple interest is:"+ p*r*t/100);

    }
   
    
}
