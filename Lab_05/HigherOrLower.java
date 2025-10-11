//********************************************************************
//  Guessing.java       Java Foundations
//
//  Demonstrates the use of a block statement in an if-else.
//********************************************************************

import java.util.*;

public class HigherOrLower {
    //-----------------------------------------------------------------
    //  Plays a simple guessing game with the user.
    //-----------------------------------------------------------------
    public static void main(String[] args) {
        final int MAX = 10;
        int answer, guess;

        Scanner scan = new Scanner(System.in);
        Random generator = new Random();

        answer = generator.nextInt(MAX) + 1;

        System.out.print("I'm thinking of a number between 1 and "
                + MAX + ". Guess what it is: ");

        guess = scan.nextInt();

        while (guess != answer) {

            if (guess < 1 || guess > 10) {
                System.out.println("Your guess is out of range...");
            } else if (guess > answer) {
                System.out.println("Higher");
            } else {
                System.out.println("Lower");
            }

            System.out.print("That is not correct, Keep guessing: ");
            guess = scan.nextInt();
        }

        if (guess == answer) {
            System.out.println("You got it! Good guessing!");
        }
    }
}
