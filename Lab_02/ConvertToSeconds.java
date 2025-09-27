/*
 * Program Name: ConvertToSeconds.java
 * Description: Reads hours, minutes, and seconds from the user 
 *              and converts the input into total seconds.
 */

import java.util.Scanner;

public class ConvertToSeconds {
    public static void main(String[] args) {
        // Step 1: Create a Scanner object for input
        Scanner in = new Scanner(System.in);

        // Step 2: Declare variables for hours, minutes, and seconds
        int hours;
        int minutes;
        int seconds;

        // Step 3: Prompt the user to enter hours, minutes, and seconds
        System.out.print("Enter hours (>= 0): ");

        hours = in.nextInt();

        System.out.print("Enter minutes (>= 0): ");
        minutes = in.nextInt();

        System.out.print("Enter seconds (>= 0): ");
        seconds = in.nextInt();

        // Step 4: Convert everything into total seconds
        int totalSeconds = hours * 3600 + minutes * 60 + seconds;

        // Step 5: Print the result
        System.out.println("Hours: "+ hours);
        System.out.println("Minutes: " + minutes);
        System.out.println("Seconds: " + seconds);
        System.out.println("Total seconds: " + totalSeconds);

        // Step 6: Close the Scanner
        in.close();
    }
}
