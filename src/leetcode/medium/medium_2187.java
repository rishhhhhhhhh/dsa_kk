package medium;

public class medium_2187 {
    public static void main(String[] args) {
        int[] arr={1,2,3};
        System.out.println(minimumTime(arr, 5));
    }
   
        public static long minimumTime(int[] time, int totalTrips) {
            long lo = 0, hi = 100_000_000_000_000L;
            while (lo < hi) {
                long need = lo + (hi - lo) / 2;
                long trips = 0;
                for (int t : time) {
                    trips += need / t;
                }
                if (trips < totalTrips) {
                    lo = need + 1;
                }else {
                    hi = need;
                }
            }
            return lo;
        }
    }
