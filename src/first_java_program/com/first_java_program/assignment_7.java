package firstjavaprogram_ep8;

import java.util.Scanner;

//To calculate Fibonacci Series up to n numbers. 0,1,1,2,3,5,8....
public class assignment_7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = 0;
        int b = 1;
        int sum = 0;
        System.out.print("enter nth term of series:");
        int n = scan.nextInt();
        for(int i = 0;i<=n;i++){
            sum = a+b;
            a = b;
            b = sum;
        }
        System.out.println("fibonacci series is:"+ sum);
        scan.close();
    }
}
