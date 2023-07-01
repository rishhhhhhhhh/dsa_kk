import java.util.ArrayList;
import java.util.List;

public class shopselection {
    public static void main(String[] args) {
        int[][] shops = {{1, 3}, {2, 4}, {1, 5}, {3, 2}};
        int maxWeight = 6;

        int count = countSelectedShops(shops, maxWeight);

        System.out.println(count);
    }

    public static int countSelectedShops(int[][] shops, int maxWeight) {
        int count = 0;
        int currentWeight = 0;

        for (int i = 0; i < shops.length; i++) {
            int weight = shops[i][1];

            if (currentWeight + weight <= maxWeight) {
                count++;
                currentWeight += weight;
            }
        }

        return count;
    }
}
