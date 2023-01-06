package leetcode;

import java.util.ArrayList;
import java.util.List;

public class easy_442 {
    public List<Integer> findDuplicates(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swap(arr, i , correct);
            } else {
                i++;
            }
        }

        List<Integer> ans = new ArrayList<>();
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index+1) {
                ans.add(arr[index]);
            }
        }

        return ans;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}

// public List<Integer> findDuplicates(int[] arr) {
//     List<Integer> ans = new ArrayList<>();
//     for(int i=0;i<arr.length;i++){
//         while((i+1)!=arr[i]){
//             if(arr[arr[i]-1] == arr[i]){
//                 break;
//             }
//             int temp =arr[arr[i]-1];
//             arr[arr[i]-1] = arr[i];
//             arr[i] = temp;
//         }
//     }

//     for(int i=0;i<arr.length;i++){
//         if(arr[i]!=i+1){
//             ans.add(arr[i]);
//         }
//     }
//     return ans;
// }
