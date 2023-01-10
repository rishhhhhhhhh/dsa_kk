package mathsfordsa;


public class numberofdigits {
    public static void main(String[] args) {
        int a=6;
        int b=2;
    
        int count= (int)(Math.log(a)/Math.log(b)) +1;
        System.out.println(count); 
    }
  

    
}
