package advancedjava;

import java.util.ArrayList;
import java.util.Scanner;

class Book{
    int bookNo;
    String bookName;
    int price;

    Book(){}

    Book(int bookNo, String bookName, int price){
        this.bookNo = bookNo;
        this.bookName = bookName;
        this.price = price;
    }

    public void display(){
        System.out.println("Book Number: " + this.bookNo
                + "\nTitle: " + this.bookName
                + "\nPrice: Rs." + this.price);
        System.out.println();
    }

    public void purchaseBook(){
        System.out.println("The Book amount is successfully added to the bill!!");
        this.getBill();
    }

    public void getBill(){
        System.out.println("You purchased: " + this.bookNo +
                "\nThe title is: " + this.bookName +
                "\nThe total amount to be paid is: " + this.price);
    }
}

class SpecialEditionBook extends Book {
    int discount;

    SpecialEditionBook(int bookNo, String bookName, int price, int discount) {
        super(bookNo, bookName, price);
        this.discount = discount;
    }

    public void display(){
        super.purchaseBook();
        int discount_Price = price - ((price * discount) / 100);
        System.out.println("After discount price is: " + discount_Price);
    }
}
public class QuestionTwoBooks {
    public static void main(String[] args) {
        System.out.println("Welcome to our Book Store!");
        System.out.println("Select the book number and enter the quantity to purchase any book");

        ArrayList<Book> bookList = new ArrayList<>();
        Book book = new Book(1, "It Starts with us", 966);
        Book book1 = new Book(2, "The Autobiography of Vishvas Patel", 1069);
        Book book2 = new Book(3, "Verity", 699);
        Book book3 = new Book(4, "Forgetting You", 1015);
        bookList.add(book);
        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);

        for(Book b : bookList){
            b.display();
        }

        Scanner sc = new Scanner(System.in);
        int bookNo = sc.nextInt();

        SpecialEditionBook sp = new SpecialEditionBook(bookNo, bookList.get(bookNo - 1).bookName, bookList.get(bookNo - 1).price, 5);
        sp.display();
        sc.close();
}
}
