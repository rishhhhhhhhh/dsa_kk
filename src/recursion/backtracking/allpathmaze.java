package recursion.backtracking;

public class allpathmaze {
    public static void main(String[] args) {
        boolean[][] road = {
            {true, true, true},
            {true, true, true},
            {true, true, true}
    };
    allpath("", road, 0, 0);
}
    
    static void allpath(String ans, boolean[][] maze, int row, int column) {
        if (row == maze.length - 1 && column == maze[0].length - 1) {
            System.out.println(ans);
            return;
        }
        if (maze[row][column]==false) {
            return;
        }
        maze[row][column] = false;

        if (row < maze.length - 1) {
            allpath(ans + 'D', maze, row+1, column);
        }

        if (column < maze[0].length - 1) {
            allpath(ans + 'R', maze, row, column+1);
        }

        if (row > 0) {
            allpath(ans + 'U', maze, row-1, column);
        }

        if (column > 0) {
            allpath(ans + 'L', maze, row, column-1);
        }
        maze[row][column] = true;
    }
}

