

import java.util.Arrays;

// public class array_rotation {
//     public static void main(String[] args) {
//         int[] arr = {4, 5, 1, 2, 3, 6, 7, 8}; 
//         rotateArray(arr, 8, 5);
//         System.out.println("Rotated Array: " + Arrays.toString(arr));
//     }
    
//     public static void rotateArray(int[] arr, int length, int numOfRotations){
//         if (numOfRotations == 0) {
//             return;
//         }
        
//         int temp = arr[0];
//         for (int i = 0; i < length - 1; i++) {
//             arr[i] = arr[i + 1];
//         }
//         arr[length - 1] = temp;
        
//         rotateArray(arr, length, numOfRotations - 1);
//     }
// }

public class array_rotation {
     public static void main(String[] args) {
        int length = 8;
        int[] arr = {4, 5, 1, 2, 3, 6, 7, 8};
        int numOfRotations = 5;
        
        rotateArray(arr, length, numOfRotations);
        
        System.out.println("Rotated Array: " + Arrays.toString(arr));
    }
    
    public static void rotateArray(int[] arr, int length, int numOfRotations) {
        if (numOfRotations == 0) {
            return;
        }
        
        if (numOfRotations > length) {
            numOfRotations = numOfRotations % length;
        }
        
        if (numOfRotations == length - numOfRotations) {
            swap(arr, 0, length - numOfRotations, numOfRotations);
            return;
        }
        
        if (numOfRotations < length - numOfRotations) {
            swap(arr, 0, length - numOfRotations, numOfRotations);
            rotateArray(arr, length - numOfRotations, numOfRotations);
        } else {
            swap(arr, 0, numOfRotations, length - numOfRotations);
            rotateArray(arr, numOfRotations, length - numOfRotations);
        }
    }
    
    public static void swap(int[] arr, int startA, int startB, int size) {
        for (int i = 0; i < size; i++) {
            int temp = arr[startA + i];
            arr[startA + i] = arr[startB + i];
            arr[startB + i] = temp;
        }
    }
}

