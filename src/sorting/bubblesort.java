package sorting;

import java.util.Arrays;

public class bubblesort {
    public static void main(String[] args) {
        int[] arr = {75,81,55,23,48};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubble(int[] arr){
        boolean swapped;
    
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
         
            for (int j = 0; j < arr.length - i - 1; j++) {   
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if (swapped==false) { 
                break;
            }
        }
    }
}
