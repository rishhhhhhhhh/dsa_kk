package medium;

public class medium_1011 {
    public static void main(String[] args) {
        int[] weights={1,2,3,4,5,6,7,8,9,10};
        System.out.println(shipWithinDays(weights, 5));
        
    }
    public static int shipWithinDays(int[] weights, int days) {
        int left = 0; // minimum capacity, can carry one package at a time
        int right = 0; // maximum capacity, can carry all packages at once
        for (int w : weights) {
            left = Math.max(left, w);
            right += w;
        }
        while (left < right) {
            int mid = left + (right-left)/2; // try to minimize the capacity
            int count = 1; // start with one day
            int total = 0; // current weight on the ship
            for (int w : weights) {
                if (total + w > mid) { // need to start a new day
                    count++;
                    total = w;
                } else {
                    total += w;
                }
            }
            if (count > days) { // too few capacity, need to increase it
                left = mid + 1;
            } else { // enough capacity, can try to decrease it
                right = mid;
            }
        }
        return left; // or right, they are equal at the end
    }
}
