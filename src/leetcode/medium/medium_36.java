package medium;

public class medium_36 {
    public static void main(String[] args) {
        char[][] board = 
        {{'5','3','.','.','7','.','.','.','.'}
        ,{'6','.','.','1','9','5','.','.','.'}
        ,{'.','9','8','.','.','.','.','6','.'}
        ,{'8','.','.','.','6','.','.','.','3'}
        ,{'4','.','.','8','.','3','.','.','1'}
        ,{'7','.','.','.','2','.','.','.','6'}
        ,{'.','6','.','.','.','.','2','8','.'}
        ,{'.','.','.','4','1','9','.','.','5'}
        ,{'.','.','.','.','8','.','.','7','9'}};
        System.out.println(isValidSudoku(board));
    }

    public static boolean isValidSudoku(char[][] board) {
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                if(board[i][j]=='.'){
                    continue;
                }
                if(!valid(board,i,j)){
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean valid(char[][] board,int r,int c){

        for(int i=0;i<board.length;i++){
            if(board[r][i]=='.'){
                    continue;
                }
           if(board[r][i]==board[r][c]&&i!=c){
            return false;
           }
        }

         for(int i=0;i<board.length;i++){
             if(board[i][c]=='.'){
                    continue;
                }
            if(board[i][c]==board[r][c]&&i!=r){
             return false;
            }
        }


        int rowStart = r - r%3;
        int colStart = c - c%3;
        for(int i=rowStart;i<rowStart+3;i++){
            for(int j=colStart;j<colStart+3;j++){
                if(board[i][j]=='.'){
                    continue;
                }
                if(board[i][j]==board[r][c]&&i!=r&&j!=c){
                    return false;
                }
            }
        }
        return true;
    }
}
