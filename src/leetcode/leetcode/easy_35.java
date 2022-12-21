package leetcode;

public class easy_35 {
   public static void main(String[] args) {
      int[] arr = {1,3,4,5};
      System.out.println(searchInsert(arr, 2)); 
   }

public static int searchInsert(int[] arr, int target) {
       
         for(int i = 0; i < arr.length; i++)
            if(arr[i] == target) {
               return i;
            }
            else if (arr[i] > target){
              return i;
            } 

           return arr.length;
    }
   
   }

