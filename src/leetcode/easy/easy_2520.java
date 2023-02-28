package easy;

public class easy_2520 {
    public static void main(String[] args) {
        System.out.println(countDigits(666));
    }
   
        public static int countDigits(int num) {
            int ans = num, count = 0;
            while (ans > 0) {
                if (num % (ans % 10) == 0){ count++;}
                ans /= 10;
            }
            return count;
        }
}
