class Solution {
    public double champagneTower(int poured, int query_row, int query_glass) {

        double[][] tower = new double[query_row+1][query_row+1];
        
        tower[0][0]=(double)poured;

        for(int i=0;i<query_row;i++)
        {
            for(int j=0;j<=i;j++)
            {

                double pouring=(tower[i][j]-1.0)/2.0;
                if(pouring>0.0){
                    tower[i+1][j]+=pouring;
                    tower[i+1][j+1]+=pouring;
                }
            }
        }

        return Math.min(1.0,tower[query_row][query_glass]);

        
        
    }
}
