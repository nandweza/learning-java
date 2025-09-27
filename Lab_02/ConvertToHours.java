/*
 * Program Name: ConvertToHours.java
 * Description: Reads total seconds from the user and converts 
 *              them into hours, minutes, and seconds (integer form), 
 *              and also displays fractional hours.
 */

import java.util.Scanner;

public class ConvertToHours {
    public static void main(String[] args) {
        // Step 1: Create a Scanner object for input
        Scanner in = new Scanner(System.in);

        // Step 2: Prompt the user for total seconds
        System.out.print("Enter total seconds (>= 0): ");
        int totalSeconds = 0;
        totalSeconds = in.nextInt();

        // Step 3: Convert totalSeconds to hours, minutes, and seconds
        int hours = totalSeconds / 3600;

        int remaining = totalSeconds % 3600;

        int minutes = remaining / 60;

        int seconds = remaining % 60;

        // Step 4: Display the integer-based time
        System.out.println("Total seconds: "+ totalSeconds);
        System.out.println("Hours: " + hours);
        System.out.println("Minutes: " + minutes);
        System.out.println("Seconds: "+ seconds);

        // Step 5: Calculate fractional hours
        double fractionalHours = totalSeconds / 3600.0;

        // Step 6: Display fractional hours with 6 decimal places
        System.out.printf("Fractioanl hours: %.6f%n", fractionalHours);

        // Step 7: Close the Scanner
        in.close();
    }
}
