package hard;

public class hard_123 {
    public static void main(String[] args) {
        int[] arr={3,3,5,0,0,3,1,6,4};
        System.out.println(maxProfit(arr));
    }
   
        public static int maxProfit(int[] prices) {
            int buy1 = Integer. MAX_VALUE, buy2 = Integer. MAX_VALUE;
            int sell1 = 0, sell2 = 0;
    
            for (int currPrice : prices) {
                buy1 = Math.min(currPrice, buy1);
                sell1 = Math.max(sell1, currPrice - buy1);
    
                buy2 = Math.min(buy2, currPrice - sell1);
                sell2 = Math.max(sell2, currPrice - buy2);
    
            }
    
            return sell2;
        }
    }
    
