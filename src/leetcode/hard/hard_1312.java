package hard;

import java.util.Arrays;

public class hard_1312 {
    public static void main(String[] args) {
        System.out.println(minInsertions("zzazz"));
    }

        public static int minInsertions(String s) {
            return s.length() - longestPalindromeSubseq(s);
        }
        static int longestPalindromeSubseq(String s) {
           StringBuilder sb = new StringBuilder(s);
            StringBuilder revsb = sb.reverse();
            String s2 = revsb.toString();
            int i = s.length()-1;
            int j = s2.length()-1;
            int[][] dp = new int[i+1][j+1];
            for(int row[] : dp){
                Arrays.fill(row, -1);
            }
            
            return lcs(s,s2,i,j,dp);
        }
        
        static int lcs(String s1, String s2,int i,int j, int[][] dp){
           
            if(i<0 || j<0){
                 return 0;
             }
            
            if(dp[i][j]!=-1){
                return dp[i][j];
            }
            
            int match=0;
            int notmatch =0;
            
        
            if(s1.charAt(i)==s2.charAt(j)){
                match = 1 + lcs(s1, s2, i-1, j-1, dp);
            }
            else{
                notmatch =  0 + Math.max(lcs(s1, s2, i-1, j, dp), lcs(s1, s2, i, j-1, dp));
            }
            
            return dp[i][j] = match + notmatch;
        }
    }

