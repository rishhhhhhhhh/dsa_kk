package medium;

public class medium_122 {
    public static void main(String[] args) {
        int[] arr={7,1,5,3,6,4};
        System.out.println(maxProfit(arr));
    }
    public static int maxProfit(int[] prices) {
		// We need prices for 2 days at least to find the profit.
        if (prices == null || prices.length <= 1) {
            return 0;
        }

        int totalProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            // Checking if we can profit with previous day's price.
            // If yes, then we buy on previous day and sell on current day.
            // Add all such profits to get the total profit.
            if (prices[i - 1] < prices[i]) {
                totalProfit += prices[i] - prices[i - 1];
            }
        }

        return totalProfit;
    }
}
