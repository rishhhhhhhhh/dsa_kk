package mathsfordsa;

public class oddoreven {
    public static void main(String[] args) {
        System.out.println(isOdd(56));
    }
    
    private static boolean isOdd(int n){
        return(n&1)==1;
    }
}
