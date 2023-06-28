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
