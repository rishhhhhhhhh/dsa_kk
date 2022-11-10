package com.first_java_program;
import java.util.Scanner;

public class assignment_1 {
    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);
       System.out.print("Enter a number: ");
       int number= sc.nextInt();

       if(number%2==0){
           System.out.println("The given number is even");
       }

       else{
           System.out.println("The given number is odd");
       }

        }
}