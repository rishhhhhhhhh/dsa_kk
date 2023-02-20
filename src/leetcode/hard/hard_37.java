package hard;
public class hard_37 {
        public static void solveSudoku(char[][] board) {
             solve(board);
         }
     
         public static boolean solve(char[][] board){
             for(int i = 0; i < board.length; i++){
                 for(int j = 0; j < board[0].length; j++){
                     if(board[i][j] == '.'){
                         for(char digit = '1'; digit <= '9'; digit++){
                             if(isValid(board, i, j, digit)){
                                 board[i][j] = digit; 
     
                                 if(solve(board))
                                     return true; 
                                 else
                                     board[i][j] = '.'; 
                             }
                         }
     
                         return false;
                     }
                 }
             }
             return true;
         }
     
           static boolean isValid(char[][] board, int row, int col, char digit){
             int rowstart = 3 * (row / 3); 
             int colstart = 3 * (col / 3);  
             for (int i = 0; i < 9; i++) {
                 if (board[i][col] == digit){
                    return false;
                }  
                 if (board[row][i] == digit) {
                    return false;
                } 
                 if (board[rowstart + i / 3][colstart + i % 3] == digit) {
                    return false;
                } 
             }
             return true;
         }
     }

