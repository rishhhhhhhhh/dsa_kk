package medium;

public class medium_875 {
    public static void main(String[] args) {
        int[] piles = {3,6,7,11};
        System.out.println(minEatingSpeed(piles, 8) );
    }
    public static int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = 1000000000;
        int k = 0;
        while(low <= high){
            k = low + (high - low) / 2;
            int hours = 0;
            for(int i = 0; i < piles.length; i++){
                hours += Math.ceil(1.0 * piles[i] / k);
            }
             if(hours > h){
                low = k + 1;
            }else{
                high = k - 1;
            }
        }
        return low;
    }
}
