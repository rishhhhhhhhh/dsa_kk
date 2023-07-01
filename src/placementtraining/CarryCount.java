import java.util.Scanner;

public class CarryCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second integer: ");
        int num2 = scanner.nextInt();

        scanner.close();

        int carry = countCarry(num1, num2);
        System.out.println("Carry: " + carry);
    }

    public static int countCarry(int num1, int num2) {
        int carry = 0;
        int currentCarry = 0;

        while (num1 > 0 || num2 > 0) {
            int digit1 = num1 % 10;
            int digit2 = num2 % 10;

            int sum = digit1 + digit2 + currentCarry;
            if (sum >= 10) {
                carry++;
                currentCarry = 1;
            } else {
                currentCarry = 0;
            }

            num1 /= 10;
            num2 /= 10;
        }

        return carry;
    }
}
