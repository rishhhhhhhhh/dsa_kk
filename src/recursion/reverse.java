package recursion;

public class reverse {
    
    public static void main(String[] args) {
        System.out.println(rev1(1234));
        System.out.println(palin(45654));
       
    }
      

      static int sum=0;
      static void rev(int n){
          if(n==0){
              return;
          }
          int rem = n%10;
          sum = sum*10 +rem;
          rev(n/10);
      }

      static int rev1(int n) {
        int digits = (int)(Math.log10(n)) + 1;
        return helper(n, digits);
    }

    private static int helper(int n, int digits) {
        if (n%10 == n) {
            return n;
        }
        int rem = n % 10;
        return rem * (int)(Math.pow(10, digits-1)) + helper(n/10, digits-1);
    }

    static boolean palin(int n) {
        return n == rev1(n);
    }

    
}
