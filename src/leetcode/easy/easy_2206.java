class Solution {
    public boolean divideArray(int[] nums) {
        int[] n = new int[501];
        for(int i=0;i<nums.length;i++){
            n[nums[i]]++;
        }
        for(int i=0;i<501;i++){
            if(n[i]%2==1) return false;
        }
        return true;
    }
}