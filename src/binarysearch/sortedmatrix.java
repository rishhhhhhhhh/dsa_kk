package binarysearch;

import java.util.Arrays;

public class sortedmatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {11, 12, 13},
                {14, 15, 16},
                {17, 18, 19}
        };
        System.out.println(Arrays.toString(search(arr, 16)));
    }


    static int[] binarysearch(int[][] matrix, int row, int colStart, int colEnd, int target) {
        while (colStart <= colEnd) {
            int mid = colStart + (colEnd - colStart) / 2;
            if (matrix[row][mid] == target) {
                return new int[]{row, mid};
            }
            if (matrix[row][mid] < target) {
                colStart = mid + 1;
            } else {
                colEnd = mid - 1;
            }
        }
        return new int[]{-1, -1};
    }

    static int[] search(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        if (cols == 0){
            return new int[] {-1,-1};
        }
        if (rows == 1) {
            return binarysearch(matrix,0, 0, cols-1, target);
        }

        int rStart = 0;
        int rEnd = rows - 1;
        int colMid = cols / 2;

        while (rStart < (rEnd - 1)) { 
            int mid = rStart + (rEnd - rStart) / 2;
            if (matrix[mid][colMid] == target) {
                return new int[]{mid, colMid};
            }
            if (matrix[mid][colMid] < target) {
                rStart = mid;
            } else {
                rEnd = mid;
            }
        }

        if (matrix[rStart][colMid] == target) { 
            return new int[]{rStart, colMid};
        }
        if (matrix[rStart + 1][colMid] == target) {
            return new int[]{rStart + 1, colMid};
        }

        if (target <= matrix[rStart][colMid - 1]) {
            return binarysearch(matrix, rStart, 0, colMid-1, target);
        }
     
        if (target >= matrix[rStart][colMid + 1] && target <= matrix[rStart][cols - 1]) {
            return binarysearch(matrix, rStart, colMid + 1, cols - 1, target);
        }
     
        if (target <= matrix[rStart + 1][colMid - 1]) {
            return binarysearch(matrix, rStart + 1, 0, colMid-1, target);
        } 
        else {
            return binarysearch(matrix, rStart + 1, colMid + 1, cols - 1, target);
        }
    }
}
