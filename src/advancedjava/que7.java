package advancedjava;

import java.util.Scanner;

class InvalidDOBYearException extends Exception {
    public InvalidDOBYearException() {
        super("Invalid DOB year! Must be between 1900 and 2022.");
    }
}

class BankAccount {
    private String name;
    private int dobYear;
    private int balance;

    public BankAccount(String name, int dobYear, int balance) {
        this.name = name;
        this.dobYear = dobYear;
        this.balance = balance;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("DOB year: " + dobYear);
        System.out.println("Balance: " + balance);
    }
}

public class que7{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        int dobYear, balance;

        System.out.print("Enter name: ");
        name = sc.nextLine();
        System.out.print("Enter DOB year: ");
        dobYear = sc.nextInt();
        System.out.print("Enter balance: ");
        balance = sc.nextInt();

        try {
            validateDOBYear(dobYear); 
            BankAccount account = new BankAccount(name, dobYear, balance);
            account.displayDetails();
        } catch (InvalidDOBYearException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void validateDOBYear(int dobYear) throws InvalidDOBYearException {
        if (dobYear < 1900 || dobYear > 2022) {
            throw new InvalidDOBYearException();
        }
    }
}
