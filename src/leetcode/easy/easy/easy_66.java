package easy;

import java.util.Arrays;

public class easy_66 {
    public static void main(String[] args) {
        int [] arr={1,2,3};
        System.out.println(Arrays.toString(plusOne(arr)));
    }

    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
       if (digits[i] < 9) {
           digits[i]++;
           return digits;
       }
       digits[i] = 0;
   }
   digits = new int[digits.length + 1];
   digits[0] = 1;
   return digits;             
       }
}
