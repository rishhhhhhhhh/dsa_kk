package medium;

import java.util.Arrays;

public class medium_912 {
    public static void main(String[] args) {
        int[] arr = {16,15,14,13,12,11};
        sort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));

      
        
    }    
    
   static void sort(int[] num, int low, int hi) {
        if (low >= hi) {
            return;
        }
        int s = low;
        int e = hi;
        int m = s + (e - s) / 2;
        int pivot = num[m];
        while (s <= e) {
            while (num[s] < pivot) {
                s++;
            }
            while (num[e] > pivot) {
                e--;
            }
            if (s <= e) {
                int temp = num[s];
                num[s] = num[e];
                num[e] = temp;
                s++;
                e--;
            }
        }
        sort(num, low, e);
        sort(num, s, hi);
    }

}
