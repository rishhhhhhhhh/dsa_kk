package firstjavaprogram_ep8;

import java.util.Scanner;

//To find out whether the given String is Palindrome or not.
public class assignment_8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter string:");
        String str = scan.next();
        String rev = "";
        for(int i=str.length()-1;i>=0;i--){
            rev = rev + str.charAt(i);
        }
        if(str.equals(rev)){
            System.out.println("string is palindrome!");
        } else{System.out.println("string is not palindrome1");}
        scan.close();
    }
    
}
