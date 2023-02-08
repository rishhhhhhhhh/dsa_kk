package recursion.backtracking;
import java.util.ArrayList;

public class maze {
    public static void main(String[] args) {
        System.out.println(count(3, 3));
        mazepath("", 3, 3);
        System.out.println(mazepathAL("", 3, 3));
        System.out.println(mazepathdiag("", 3, 3));

    }

    static int count(int row, int column) {
        if (row == 1 || column == 1) {
            return 1;
        }
        return count(row-1, column)+count(row, column-1);
    }

    static void mazepath(String ans, int row, int column) {
        if (row == 1 && column == 1) {
            System.out.println(ans);
            return;
        }
        if (column > 1) {
            mazepath(ans + 'R', row, column-1);  
        }
        if (row > 1) {
            mazepath(ans + 'D', row-1, column);
        
        }

    }

    static ArrayList<String> mazepathAL(String ans, int row, int column) {
        if (row == 1 && column == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(ans);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();        
        if (column > 1) {
            list.addAll(mazepathAL(ans + 'R', row, column-1));
        }
        if (row > 1) {
            list.addAll(mazepathAL(ans + 'D', row-1, column));
        }
        return list;
    }

    static ArrayList<String> mazepathdiag(String ans, int row, int column) {
        if (row == 1 && column == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(ans);
            return list;
        }
        ArrayList<String> list = new ArrayList<>(); 
        if (row > 1 && column > 1) {
            list.addAll(mazepathdiag(ans + 'I', row-1, column-1));
        }       
        if (column > 1) {
            list.addAll(mazepathdiag(ans + 'R', row, column-1));
        }
        if (row > 1) {
            list.addAll(mazepathdiag(ans + 'D', row-1, column));
        }
        return list;
    }
}

