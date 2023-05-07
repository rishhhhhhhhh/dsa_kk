package leetcode.hard;

class Solution {
    public int[] longestObstacleCourseAtEachPosition(int[] obs) {
        int[] ans = new int[obs.length];
        int[] dp = new int[obs.length];
        int high = 0;
        for(int i=0;i<obs.length;i++){
           int idx = binarySearch(dp,0,high-1,obs[i]);
           dp[idx] = obs[i];
           if(idx == high){
             high++;
           }
           ans[i] = idx+1;
        }
        return ans;
    }
    public int binarySearch(int[] dp,int low,int high,int target){
      while(low<=high){
        int mid = low + (high-low)/2;
        if(dp[mid] <= target){
          low = mid+1;
        }
        else{
          high = mid-1;
        }
      }
      return low;
    }
}
