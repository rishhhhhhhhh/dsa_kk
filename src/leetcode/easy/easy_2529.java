class Solution {
    public int maximumCount(int[] nums) {
      int pos=0,neg=0;
        for(int a:nums){
            if(a==0)continue;
            if(a>0) pos++;
            else neg++;
        }
        return pos>=neg?pos:neg;  
    }
}