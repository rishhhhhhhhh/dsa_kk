package com.first_java_program;

//Write a program to print whether a number is even or odd, also take
//input from the user.

import java.util.Scanner;

public class assignment_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter your number:");
        int number = scan.nextInt();
        if( number%2==0){
            System.out.println(number+" is even!");    
        }
        else{System.out.println(number+" is odd!");}
        scan.close();    
    }
    
}