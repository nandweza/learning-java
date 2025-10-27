// Bookshelf.java
// Instatiates and updates several Book objects.

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Bookshelf {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Book> bookList = new ArrayList<>();

        System.out.println("Welcome to your Bookshelf!");

        char addMore;

        do { 
            System.out.print("Enter the title of the book: ");
            String title = scan.nextLine().trim();

            System.out.print("Enter the author of the book: ");
            String author = scan.nextLine().trim();

            System.out.print("Enter the publisher of the book: ");
            String publisher = scan.nextLine().trim();

            System.out.print("Enter the copyright date of the book: ");
            String copyrightDate = scan.nextLine().trim();

            Book book = new Book(title, author, publisher, copyrightDate);
            System.out.println("\nBook added to your shelf:");
            System.out.println(book);
            bookList.add(book);

            System.out.print("Would you like to add another book to your shelf? (y/n): ");
            addMore = scan.nextLine().trim().toLowerCase().charAt(0);
        } while (addMore == 'y');

        System.out.println("\nYou have added the following books to your shelf:");
        for (Book myBook : bookList) {
            System.out.println("\n" + myBook);
        }

        System.out.println("\n Thank you for using your Bookshelf!");
        scan.close();
    }
}