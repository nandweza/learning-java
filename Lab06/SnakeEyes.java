//********************************************************************
//  SnakeEyes.java       Java Foundations
//
//  Demonstrates the use of a programmer-defined class.
//********************************************************************

import java.util.Scanner;

public class SnakeEyes {
	//-----------------------------------------------------------------
	//  Creates two Die objects and rolls them several times, counting
	//  the number of snake eyes that occur.
	//-----------------------------------------------------------------
	public static void main (String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("How many sides should the dice have? ");
		int sides = scan.nextInt();

		final int ROLLS = 500;
		int num1, num2, count = 0;

		Die die1 = new Die(sides);
		Die die2 = new Die(sides);

		for (int roll = 1; roll <= ROLLS; roll++) {
			num1 = die1.roll();
			num2 = die2.roll();

			if (num1 == 1 && num2 == 1) {  // check for snake eyes
				count++;
			} 
		}

		System.out.println ("Number of rolls: " + ROLLS);
		System.out.println ("Number of snake eyes: " + count);
		System.out.println ("Ratio: " + (float)count / ROLLS);
	}
}
