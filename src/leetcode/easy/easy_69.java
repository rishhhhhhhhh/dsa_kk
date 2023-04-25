package leetcode.easy;
public class easy_69 {
    public static void main(String[] args) {
        System.out.println(mySqrt(25));
    }
        public static int mySqrt(int x) {
            int left = 1;
            int right = x;
    
            while(left <= right){
                int mid = left + (right-left)/2;
    
                if(x / mid == mid){
                    return mid;
                } else if(mid > x / mid){
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
    
            return right;
        }
    
}
