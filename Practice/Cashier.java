// Cashier.java
// A simple cashier program that calculates total cost with tax and handles payment.

import java.util.Scanner;
import java.text.DecimalFormat;

public class Cashier {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        double price = 0.0;

        double total = 0.0;
        double bill = 0, change;
        final double TAX_RATE = 0.06;

        System.out.println("Welcome to JavaMart!");

        do {
            System.out.print("Enter the price of each item: $");
            price = scan.nextDouble();
            total += price;
        } while (price != 0.0);

        System.out.println("Your total amount before tax is: $" + df.format(total));

        double totalCost = (total * TAX_RATE) + total;
        System.out.println("Your total amount after tax is: $" + df.format(totalCost));

        System.out.print("Please enter your bill amount: $");
        bill = scan.nextDouble();

        while (bill < total) {
            System.out.print("Enter another bill amount: $");
            bill += scan.nextDouble();
        }

        change = bill - totalCost;
        System.out.println("Your change is: $" + df.format(change));
        System.out.println("Thank you for shopping at JavaMart!");
        scan.close();
    }
}