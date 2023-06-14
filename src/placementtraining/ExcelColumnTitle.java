package placementtraining;

public class ExcelColumnTitle {
     public static void main(String[] args) {
         System.out.println(getColumnTitle(28));
    }

    public static String getColumnTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();

        while (columnNumber > 0) {
            int rem = columnNumber % 26;

            if (rem == 0) {
                sb.insert(0, 'Z');
                columnNumber = (columnNumber / 26) - 1;
            } else {
                sb.insert(0, (char) ((rem - 1) + 'A'));
                columnNumber /= 26;
            }
        }

        return sb.toString();
    }   
}
