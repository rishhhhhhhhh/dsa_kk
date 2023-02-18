import java.util.Scanner;

public class lotterychecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read the total number of tickets
        System.out.print("Enter the total number of tickets: ");
        int n = sc.nextInt();
        
        // Read the ticket numbers and the number to be searched
        int[] tickets = new int[n];
        System.out.print("Enter the ticket numbers: ");
        for (int i = 0; i < n; i++) {
            tickets[i] = sc.nextInt();
        }
        System.out.print("Enter the number to be searched: ");
        int num = sc.nextInt();
        
        // Search for the number in the ticket list
        int position = -1;
        for (int i = 0; i < n; i++) {
            if (tickets[i] == num) {
                position = i + 1;
                break;
            }
        }
        
        // Print the result
        if (position == -1) {
            System.out.println("Sorry the ticket number " + num + " is not there. Better luck next time!");
        } else {
            System.out.println("The ticket number " + num + " is found at position " + position + " Congratulations! You have won the lottery");
 }
 sc.close();
}
}