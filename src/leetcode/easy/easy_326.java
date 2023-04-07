package easy;

public class easy_326 {
    public static void main(String[] args) {
       System.out.println(isPowerOfThree(81));
    }

        public static boolean isPowerOfThree(int n) {
            if(n <= 0) return false;
            if(n == 1) return true;
            return n % 3 == 0 ? isPowerOfThree(n / 3) : false;
        }
    }

