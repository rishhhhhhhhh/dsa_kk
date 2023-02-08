package recursion.sortinginrecursion;

import java.util.Arrays;

public class selectionsort{
    public static void main(String[] args) {
        int[] arr = {21,78,65,53};
        sort(arr, arr.length, 0, 0);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr, int r, int c, int max) {
        if (r == 0) {
            return;
        }
        if (c < r) {
            if (arr[c] > arr[max]) {
                sort(arr, r, c+1, c);
            } else {
                sort(arr, r, c+1, max);
            }
        } else {
            int temp = arr[max];
            arr[max] = arr[c-1];
            arr[c-1] = temp;
            sort(arr, c-1, 0, 0);
        }
    }
} 