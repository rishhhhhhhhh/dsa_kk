package recursion.backtracking;

import java.util.Arrays;

public class allpathmaze {
    public static void main(String[] args) {
        boolean[][] road = {
            {true, true, true},
            {true, true, true},
            {true, true, true}
    };
    allpath("", road, 0, 0);
    int[][] path = new int[road.length][road[0].length];
    allPathPrint("", road, 0, 0, path, 1);
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

    static void allPathPrint(String ans, boolean[][] maze, int row, int column, int[][] path, int step) {
        if (row == maze.length - 1 && column == maze[0].length - 1) {
            path[row][column] = step;
            for(int[] arr : path) {
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(ans);
            return;
        }
        if (maze[row][column]==false) {
            return;
        }
        maze[row][column] = false;
        path[row][column] = step;
        if (row < maze.length - 1) {
            allPathPrint(ans + 'D', maze, row+1, column, path, step+1);
        }
        if (column < maze[0].length - 1) {
            allPathPrint(ans + 'R', maze, row, column+1, path, step+1);
        }
        if (row > 0) {
            allPathPrint(ans + 'U', maze, row-1, column, path, step+1);
        }
        if (column > 0) {
            allPathPrint(ans + 'L', maze, row, column-1, path, step+1);
        }
        maze[row][column] = true;
        path[row][column] = 0;
    }
}

