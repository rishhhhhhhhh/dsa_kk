package leetcode.medium;

class Solution {
    public long mostPoints(int[][] questions) {
        return helper(0,questions,new Long[questions.length + 1]);
    }
    public long helper(int ind,int[][] questions,Long[] dp){
       if(ind > questions.length - 1){
           return 0;
       }
        
       if(dp[ind]!=null){
           return dp[ind];
       }

        return dp[ind] = Math.max(questions[ind][0] + helper(ind+questions[ind][1]+1,questions,dp),
                       helper(ind+1,questions,dp));
        
    }
}
