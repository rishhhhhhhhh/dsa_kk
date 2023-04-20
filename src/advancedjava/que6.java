package advancedjava;
import java.util.Scanner;

class InvalidAgeException extends Exception{
    InvalidAgeException (String message){
        super(message);
    }
}
class Main{
    public static void main(String[] a){

int age;

Scanner in = new Scanner(System.in);

try{

System.out.print("Enter your age:"); 
age=in.nextInt();

if (age<18)

throw new InvalidAgeException("YOU ARE NOT ELIGGIBLE TO VOTE");

else System.out.println("YOU ARE ELIGIBLE TO VOTE");}

catch (InvalidAgeException e){
    System.out.println("CAUGHT AN EXCEPTION");
    System.out.println(e.getMessage());
}
}
}