package com;

public class floor {
    public static void main(String[] args) {
        int[] arr = {7,9,10,17,35,66,78};
        int target = 555;
        int ans = Floor(arr, target);
        System.out.println(ans);
    }

    
    static int Floor(int[] arr, int target) {

       
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
        return end;
    }
}
