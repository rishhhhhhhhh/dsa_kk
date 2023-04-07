package easy;

public class easy_35 {
   public static void main(String[] args) {
      int[] nums = {1,3,4,5};
      System.out.println(searchInsert(nums, 5)); 
   }

public static int searchInsert(int[] nums, int target) {
       
   for(int i = 0; i < nums.length; i++){
      if(nums[i] >= target) {
              return i;
           }
     }
          return nums.length;
    }
   
   }

