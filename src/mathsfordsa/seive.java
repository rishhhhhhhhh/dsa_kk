package mathsfordsa;

public class seive {
    public static void main(String[] args) {
        int n = 50;
        boolean[] prime = new boolean[n+1];
        Sieve(n, prime);
    }

    static void Sieve(int n, boolean[] prime) {
        for (int i = 2; i*i <= n; i++) {
            if (prime[i]==false) {
                for (int j = i*2; j <= n; j+=i) {
                    prime[j] = true;
                }
            }
        }
        for (int i = 2; i <= n; i++) {
            if (prime[i]==false) {
                System.out.println(i);
            }
        }
    }
}


