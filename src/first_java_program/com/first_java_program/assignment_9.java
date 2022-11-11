package com.first_java_program;

import java.util.Scanner;

public class assignment_9 {
    public static void main(String[] args) {
        int num1, num2;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number :");
        num1 = sc.nextInt();
        System.out.print("Enter the second number :");
        num2 = sc.nextInt();
        for (int i = num1; i<=num2; i++){
            int n, r, sum = 0;
            n= i;
            while(n != 0) {
               r = n % 10;
               sum = sum + (r * r * r);
               n = n / 10;
            }
            
            if(sum == i){
            System.out.println(""+i+" is an Armstrong number.");
            sc.close();
            }
              
            }
         }
      }
   


