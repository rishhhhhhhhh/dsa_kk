package sorting;

import java.util.Arrays;

public class selectionsort {
    public static void main(String[] args) {
        int[] arr = {69, 57, 89, 33, 22};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selection(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i - 1;
            int maximumIndex = maximumindex(arr, 0, last);
            swap(arr, maximumIndex, last);
        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static int maximumindex(int[] arr, int start, int end) {
        int maximum = start;
        for (int i = start; i <= end; i++) {
            if (arr[maximum] < arr[i]) {
                maximum = i;
            }
        }
        return maximum;
    }

}
