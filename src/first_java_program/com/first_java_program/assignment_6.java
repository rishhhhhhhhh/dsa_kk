package firstjavaprogram_ep8;

import java.util.Scanner;

//Input currency in rupees and output in USD.
public class assignment_6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter rupees:");
        float rup = scan.nextFloat();
        System.out.println("money in USD is:"+(rup*0.012));
        scan.close();
    }
}
