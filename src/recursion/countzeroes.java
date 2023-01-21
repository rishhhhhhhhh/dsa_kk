package recursion;

public class countzeroes {

    public static void main(String[] args) {
        System.out.println(countz(12010));
    }

    static int countz(int n) {
        if(n==0){
            return 1;
        }
        return count(n, 0);
    }

    private static int count(int n, int c) {
        if (n == 0) {
            return c;
        }

        int rem = n % 10;
        if (rem == 0) {
            return count(n/10, c+1);
        }
        return count(n/10, c);
    }
    
}
