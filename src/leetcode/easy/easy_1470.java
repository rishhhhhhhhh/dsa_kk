package easy;

import java.util.Arrays;

public class easy_1470 {
    public static void main(String[] args) {
        int[] arr={2,5,1,3,4,7};
        System.out.println(Arrays.toString(shuffle(arr, 3)));
    }

        public static int[] shuffle(int[] nums, int n) {
         int i=0;
         int j=n;
         int[] arr=new int[2*n];
         int k=0;
         while(i<n && j<2*n){
           arr[k++] =nums[i++];
            arr[k++]=nums[j++];
         }
            return arr;
        }
    }

