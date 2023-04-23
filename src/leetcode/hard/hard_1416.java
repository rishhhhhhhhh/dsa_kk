package hard;

public class hard_1416 {
    public static void main(String[] args) {
        
    }

  
    private static int numberOfArrays(String s, int k, int i) {
        int n;
        int[] dp;
      if (i == n) return 1;
      if (s.charAt(i) == '0') return 0;
  
      if (dp[i] != 0) return dp[i];
      
      for (var j=i; j<n && Long.parseLong(s.substring(i, j+1)) <= k; j++) {
        dp[i] += numberOfArrays(s, k, j+1);
        dp[i] %= 1000000007;
      }
      return dp[i];
    }
  
    public static int numberOfArrays(String s, int k) {
      int n = s.length();
      int[] dp = new int[n];
  
      return numberOfArrays(s, k, 0);
    }}

