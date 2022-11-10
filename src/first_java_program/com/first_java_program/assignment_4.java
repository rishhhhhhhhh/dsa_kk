package com.first_java_program;

import java.util.Scanner;

//take in two numbers and an operator (+, -, *, /) and calculate the value.
//(Use if conditions)

public class assignment_4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter the operation:");
        float num_1 = scan.nextFloat();
        char operation1 = scan.next().charAt(0);
        float num_2= scan.nextFloat();

        if(operation1=='+'){
            System.out.println("the sum is:"+ (num_1+num_2));

        }
        else if(operation1=='-'){
            System.out.println("the difference is:"+(num_1-num_2));

        }
        else if(operation1=='*'){
            System.out.println("the multiplication is:"+num_1*num_2);

        }
        else if(operation1=='/'){
            System.out.println("the divison is:"+num_1/num_2);

        }
        else{
            System.out.println("invalid input!");
        }
        
        scan.close();
    }   
}
