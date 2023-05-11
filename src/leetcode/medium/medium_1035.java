package leetcode.medium;

class Solution {
    public int maxUncrossedLines(int[] nums1, int[] nums2) {
        int dp[][]=new int[nums1.length][nums2.length];
        for(int[] arr:dp)
            Arrays.fill(arr,-1);
        return f(0,0,dp,nums1,nums2);
    }
    public int f(int ind1,int ind2,int[][] dp,int[] nums1,int[] nums2){
        if(ind1>=nums1.length || ind2>=nums2.length)
            return 0;
        if(dp[ind1][ind2]!=-1)
            return dp[ind1][ind2];
        int count=0;
        if(nums1[ind1]==nums2[ind2])
            count=1+f(ind1+1,ind2+1,dp,nums1,nums2);
        else{
            count=Math.max(f(ind1+1,ind2,dp,nums1,nums2),f(ind1,ind2+1,dp,nums1,nums2));
        }
        return dp[ind1][ind2]=count;
    }
}