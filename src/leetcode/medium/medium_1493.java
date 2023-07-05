class Solution {
    public int longestSubarray(int[] nums) {
        int max = 0, cur = 0, prev = 0;
        boolean b = false;
        for(int i = 0; i<nums.length; i++){
            if(nums[i] == 0){
                max = Math.max(max, cur+prev);
                prev = cur;
                cur = 0;
                b = true; 
            }
            else{
                cur++;
            }
        }
        return b ? Math.max(max, cur+prev) : cur-1;
    }
}