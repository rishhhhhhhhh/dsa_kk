package easy;

public class easy_1413 {
    public static void main(String[] args) {
        int[] nums= {-3,2,-3,4,2};
        System.out.println(minStartValue(nums));
    }

    public static int minStartValue(int[] nums) {
          int min=nums[0];
          for(int i=1;i<nums.length;i++){
              nums[i]+=nums[i-1];
              min=Math.min(min,nums[i]);
          }
          if(min>0){
              return 1;
          }
          return Math.abs(min)+1;
      }
  }

