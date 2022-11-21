package com.first_java_program;

public class ceiling {
    public static void main(String[] args) {
        int[] arr = {9,13,23,34,56,66};
        int target = 35;
        int ans = Ceiling(arr, target);
        System.out.println(ans);
    }

    
    static int Ceiling(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {
      
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } 
            else if (target > arr[mid]) {
                start = mid + 1;
            } 
            else {
                return mid;
            }
        }
        return start;
    }
}

    

