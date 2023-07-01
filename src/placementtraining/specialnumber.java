
public class specialnumber {
    public static void main(String[] args) {
        for (int i = 11; i <19; i++) {
            if (isSpecialNumber(i)) {
                System.out.println(i);}
            
    }
    System.out.println("none of the numbers in this range is a special number");

}
    
    private static boolean isSpecialNumber(int number) {
        int sum= 0;
        int product= 1;
        int temp=number;
        
        while (temp != 0) {
            int digit = temp % 10;
            sum+= digit;
            product*= digit;
            temp /= 10;
        }    
        
        return (sum + product) == number;
    }}

