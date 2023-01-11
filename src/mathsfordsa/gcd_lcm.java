package mathsfordsa;

public class gcd_lcm {
    public static void main(String[] args) {
        System.out.println(greatest(15, 25));
        System.out.println(least(15,25));
    }

    static int greatest(int a, int b){
        if(a==0){
            return b;
        }
        return greatest(b%a, a);
    }

    static int least(int a, int b){
        return a*b/greatest(a,b);
    }
    
}
