package easy;

public class easy_867 {
    public static void main(String[] args) {
        
    }

    public static int[][] transpose(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        int[][] result =new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                result[i][j]=matrix[j][i];
            }
        }
        return result;
    }
}
