package sorting;

import java.util.Arrays;

public class cyclicsort {
    public static void main(String[] args) {
        int[] arr = {3,2,4,5,1};
        cyclic(arr);
        System.out.println(Arrays.toString(arr));  
    }

    static void cyclic(int[] arr){
        int i=0;
        while(i < arr.length){
            int index = arr[i]-1;
            if(arr[i] != i+1){
            
                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
            } 
            else{
                i++;
            }
        }

    }
}
