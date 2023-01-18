package recursion;

public class productofdigits {
    public static void main(String[] args) {
        int product = digits(0);
        System.out.println(product);
    }

    static int digits(int n) {
        if (n%10==n) {
            return n;
        }
        return (n % 10) * digits(n / 10);
    }
}
