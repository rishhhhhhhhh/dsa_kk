package recursion.backtracking;

public class mazecount {
    public static void main(String[] args) {
        System.out.println(count(3, 3));
    }

    static int count(int row, int column) {
        if (row == 1 || column == 1) {
            return 1;
        }
        return count(row-1, column)+count(row, column-1);
    }
}
