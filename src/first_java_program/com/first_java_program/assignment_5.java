package com.first_java_program;

import java.util.Scanner;

//Take 2 numbers as input and print the largest number.
public class assignment_5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter number one:");
        int n1 = scan.nextInt();
        System.out.print("enter number two:");
        int n2 = scan.nextInt();
        if(n1>n2){System.out.println(n1+" is greater");}
        else{System.out.println(n2+" is greater");}
        scan.close();
    }
}
