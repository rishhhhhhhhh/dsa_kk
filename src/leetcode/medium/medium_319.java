package leetcode.medium;

public class medium_319 {
    public static void main(String[] args) {
        System.out.println(bulbSwitch(3));
    }
        public static int bulbSwitch(int n) {
            int ans = 0;
            if(n == 0) return n;
            for(int i = 1; i <= 100000 ; i++){
                long square = i;
                square*= i;
                if(square > n)
                    break;
                ans++;
            }
            return ans;
        }
    }