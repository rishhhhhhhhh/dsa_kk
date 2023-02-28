package medium;

public class medium_29 {
    public static void main(String[] args) {
        System.out.println(divide(5, 5));
        
    }
        public static int divide(int dividend, int divisor) {
            if(dividend == Integer.MIN_VALUE && divisor == -1) return Integer.MAX_VALUE;
            return dividend/divisor;
        }
    
}

//Since both dividend and divisor is a integer, the only case we need to handle is when the result will exceed the boundary and divisor 
//cannot be 0. We just try if -1 can make the result break the boundry. And the answer is yes, so we seperate this occasion alone, 
//and let the built-in operator do the rest.
