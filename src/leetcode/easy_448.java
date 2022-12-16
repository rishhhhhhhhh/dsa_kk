package leetcode;

import java.util.ArrayList;
import java.util.List;

public class easy_448 {
    public List<Integer> findDisappearedNumbers(int[] arr) {
     
        List<Integer> ans = new ArrayList<>();
            for(int i=0;i<arr.length;i++){
                while((i+1)!=arr[i]){
                    if(arr[arr[i]-1] == arr[i]){
                        break;
                    }
                    int temp =arr[arr[i]-1];
                    arr[arr[i]-1] = arr[i];
                    arr[i] = temp;
                }
            }

            for(int i=0;i<arr.length;i++){
                if(arr[i]!=i+1){
                    ans.add(i+1);
                }
            }
            return ans;
        }
    
}
