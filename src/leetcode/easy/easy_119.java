import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> getRow(int rowIndex) {
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(1); 
        for (int i = 1; i <= rowIndex; i++) {
            long curr = (long) ans.get(i - 1) * (rowIndex - i + 1) / i;
            ans.add((int) curr);
        }
        return ans;  
    }
}





class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> currentRow = new ArrayList<Integer>();

        // Base case: The first row is always [1].
        currentRow.add(1);

        for (int i = 1; i <= rowIndex; i++) {
            List<Integer> newRow = new ArrayList<Integer>();
            
            // The first element of each row is always 1.
            newRow.add(1);

            // Calculate the middle elements using the values from the previous row.
            for (int j = 1; j < i; j++) {
                int sum = currentRow.get(j - 1) + currentRow.get(j);
                newRow.add(sum);
            }

            // The last element of each row is always 1.
            newRow.add(1);

            // Update the current row with the newly calculated row.
            currentRow = newRow;
        }
        
        return currentRow;
    }
}
