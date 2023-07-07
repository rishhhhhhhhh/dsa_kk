class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        int i=0, j=0;
        int n=answerKey.length();
        int T=0, F=0;
        int ans=0;
        while(j<n){
            if(answerKey.charAt(j)=='T') ++T;
            else ++F;
            while(Math.min(T,F)>k){
                if(answerKey.charAt(i)=='T') --T;
                else --F;
                ++i;
            }
            ans=Math.max(ans, T+F);
            ++j;
        }
        return ans;
    }
}