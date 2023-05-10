package leetcode.medium;

public class Solution {
    public int[][] generateMatrix(int n) {
        int[][] a = new int[n][n];
        if (n == 0)
            return a;
        int sum = 1;
        for (int i = 0; i < n/2; i++) {
            for (int j = i; j < n-i-1; j++)
                a[i][j] = sum++;
            for (int j = i; j < n-i-1; j++)
                a[j][n-i-1] = sum++;
            for (int j = n-i-1; j > i; j--)
                a[n-i-1][j] = sum++;
            for (int j = n-i-1; j > i; j--)
                a[j][i] = sum++;
        }
        if (a[n/2][n/2] == 0)
            a[n/2][n/2] = sum;
        return a;
    }
}