package medium;

public class medium_540 {
    public static void main(String[] args) {
      int[] nums={1,1,2,2,3,3,4};
      //System.out.println(single(nums));
      System.out.println(singleNonDuplicate(nums));

    }
    public static int singleNonDuplicate(int[] nums) {
        int len=nums.length;
            int target = 0;
            for (int i = 0; i < len; i++) {
                target = target ^ nums[i];
        }        
        return target;
        }
        

        //this code is throwing exception
        public static int single(int[] nums) {
            int len = nums.length;
            if(len == 1){ return nums[0];}
            int start = 0,end = len-1;
            
            while(start<=end){
                int mid = start + (end-start)/2;
                
                if(mid%2==0){
                    if(nums[mid]!=nums[mid+1]){
                        end = mid-1;
                    }else{
                        start = mid + 1;
                    }
                }else{
                    if(nums[mid]!=nums[mid-1]){
                        end = mid-1;
                    }else{
                        start = mid+1;
                    }
                }
            }
            
            return nums[start];
        }
}
