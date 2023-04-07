package easy;

public class easy_1812 {
    public static void main(String[] args) {
        String n = "a1";
        System.out.println(squareIsWhite(n));
        
    }
  
    public static boolean squareIsWhite(String coordinates) {
        
        return (int)coordinates.charAt(0)%2 != (int)coordinates.charAt(1)%2;
       
   }
}