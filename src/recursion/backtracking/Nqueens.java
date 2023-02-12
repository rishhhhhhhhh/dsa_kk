package recursion.backtracking;

public class Nqueens {
    public static void main(String[] args) {
        int n = 6;
        boolean[][] chess = new boolean[n][n];
        System.out.println(queens(chess, 0)); 
    }    
    static int queens(boolean[][] chess, int row) {
        if (row == chess.length) {
            display(chess);
            System.out.println();
            return 1;
        }
        int count = 0;
        for (int col = 0; col < chess[0].length; col++) {
            if(cango(chess, row, col)) {
                chess[row][col] = true;
                count += queens(chess, row + 1);
                chess[row][col] = false;
            }
        }
        return count;
    }

    private static boolean cango(boolean[][] chess, int row, int col) {
        for (int i = 0; i < row; i++) {
            if (chess[i][col]) {
                return false;
            }
        }
        int maxRight = Math.min(row, chess[0].length - col - 1);
        for (int i = 1; i <= maxRight; i++) {
            if(chess[row-i][col+i]) {
                return false;
            }
        }
        int maxLeft = Math.min(row, col);
        for (int i = 1; i <= maxLeft; i++) {
            if(chess[row-i][col-i]) {
                return false;
            }
        }
        return true;
    }
    private static void display(boolean[][] chess) {
        for(boolean[] row : chess) {
            for(boolean element : row) {
                if (element==true) {
                    System.out.print("Q ");
                } else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }
}
