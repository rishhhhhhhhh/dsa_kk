class easy_1304 {
    public int[] sumZero(int n) {
        int[] res= new int[n];
        if(n%2==1) {
            res[n-1]=0;
            for(int i=0;i<n-1;i+=2){
                res[i]=i+1;
                res[i+1]=-(i+1);
            }
        }else{
            for(int i=0;i<n;i+=2){
                res[i]=i+1;
                res[i+1]=-(i+1);
            }
        }

        return res;
    }
}
