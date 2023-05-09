class Solution {
    public int diagonalSum(int[][] mat) {
        int verticalSum=0;
        for(int i=0; i<mat.length; i++){
            verticalSum+=mat[i][i];
        }
        int count=0;
        int horizontalSum=0;
        for(int j=mat[0].length-1; j>=0; j--){
            if(mat[0].length/2==count && mat[0].length%2!=0){
                count++;
                continue;
            }
            horizontalSum+=mat[count][j];  
            count++;  
        }
        return (verticalSum+horizontalSum);
    }
}
