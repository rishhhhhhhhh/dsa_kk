package recursion;

public class sumofdigits {
    public static void main(String[] args) {
        int sum = digits(469);
        System.out.println(sum);
    }

    static int digits(int n) {
        if (n == 0) {
            return 0;
        }
        return (n % 10) + digits(n / 10);
    }
}

        
  
