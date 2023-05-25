class medium_837 {
    public double new21Game(int n, int k, int maxPts) {
        if (k==0) return 1;
        double dp[] =new double[k+maxPts];
        dp[0] = 1;
        double sumDP = 1;
        for (int i=1;i<k+maxPts;i++){
            dp[i]=sumDP/maxPts;
            if (i<k) sumDP += dp[i];
            if (i>=maxPts)  sumDP-=dp[i-maxPts];
        }
        double sum = 0,total;
        for (int i=k;i<=Math.min(n,k+maxPts-1);i++) sum+=dp[i];
        total = sum;
        for (int i=n+1; i<k+maxPts; i++) total+=dp[i];
        return sum/total;
    }
}

   