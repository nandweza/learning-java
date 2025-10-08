// Cashier.java
// A simple cashier program that calculates total cost with tax and handles payment.

import java.util.Scanner;

public class Cashier {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double price = 0.0;

        double total = 0.0;
        double bill = 0, change;
        final double TAX_RATE = 0.06;

        do { 
            System.out.print("Welcome to JavaMart! \n please enter the price of your item: ");
            price = scan.nextDouble();
            total += price;
        } while (price != 0.0);

        System.out.println("Your total amount before tax is: " + total);

        double totalCost = (total * TAX_RATE) + total;
        System.out.println("Your total amount after tax is: " + totalCost);

        System.out.print("Please enter your bill amount: ");
        bill = scan.nextDouble();
        
        if (bill < total) {
            double remainingBalance = totalCost - bill;
            System.out.print("You still have a balance of: " + remainingBalance + 
                            "\n Please enter another bill: ");
            double bill2 = scan.nextDouble();
            change = bill2 - remainingBalance;
            System.out.println("Your change is: " + change + " Payment received!");
        } else {
            System.out.println("Payment received!");

            change = bill - totalCost;
            System.out.println("Your change is: " + change);
        }
        scan.close();
    }
}