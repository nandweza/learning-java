/*
 * TODO:
 * Name: Allan Kindarara
 */

import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Random;

public class UnexpectedExpense {
	public static void main(String[] args) {
		final int INITIAL_MONEY;
		int inputValue, currentMoney;
		int result;
		Scanner scan = new Scanner(System.in);
		// TODO: Declare and instantiate a random number generator
		Random generator = new Random();

		// TODO: Declare and instantiate a NumberFormat object that will format percentages
		NumberFormat nf = NumberFormat.getPercentInstance();
		
		// TODO: create a semantically appropriate loop to force the user to enter a valid value (greater than 0 but less than 1500)
		// Begin Loop
		do {
			System.out.println("Please enter your beginning money [must be between 1 and 1500]: ");
			inputValue = scan.nextInt();
		} while (inputValue <= 0 || inputValue >= 1500);
		// End Loop

		INITIAL_MONEY = currentMoney = inputValue;
		System.out.println("You have " + currentMoney + " dollars remaining.");

		System.out.println("An unexpected bill just came in!");

		// TODO: generate a random number between 1 and 2500 and assign to result
		result = generator.nextInt(2500) + 1;

		System.out.println("Your unexpected bill was $" + result + ".");

		// TODO: subtract the random number from currentMoney
		currentMoney = currentMoney - result;

		// TODO: if currentMoney is greater than zero, print the percentage of your remaining money in the <<REPLACE WITH FORMAT>>
		//		 placeholder (use the proper FormatNumber), otherwise, set currentMoney to zero and print "You are broke!"
		double percentRemaining = (double) currentMoney / INITIAL_MONEY;
		if (currentMoney > 0) {
			System.out.println("You paid off the bill with " + nf.format(percentRemaining) + " of your money remaining.");
		} else {
			currentMoney = 0;
			System.out.println("You are broke!");
		}
//		System.out.println("You paid off the bill with " + <<REPLACE WITH FORMAT>> + " of your money remaining.");

		System.out.println("You have " + currentMoney + " dollars remaining.");

	}

}
