package hard;

import java.util.Arrays;
public class hard_879{
    public static void main(String[] args) {
    }


    public int profitableSchemes(int n, int minProfit, int[] group, int[] profit) {
        
        int dp[][][];
        dp=new int[105][105][105];
        for(int i=0;i<105;i++)for(int j=0;j<105;j++)Arrays.fill(dp[i][j],-1);
        return fun(0,n,minProfit,0,0,group,profit);
    }
    int mod=1000000007;
    public int fun(int i,int n,int p,int currPro,int people,int g[],int pro[])
    {
        int[][][] dp;
        if(i==g.length){
            if(currPro>=p && people<=n){
                return dp[i][currPro][people]=1;
            }
            return dp[i][currPro][people]=0;
        }
        if(dp[i][currPro][people]!=-1)return dp[i][currPro][people];
        int p1=fun(i+1,n,p,currPro,people,g,pro);
        int p2=0;
        if(people+g[i]<=n)
        p2=fun(i+1,n,p,(currPro+pro[i]>p?p:currPro+pro[i]),people+g[i],g,pro);
        return dp[i][currPro][people]=(p1+p2)%mod;
    }}
