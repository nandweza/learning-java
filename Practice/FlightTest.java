// FlightTest.java
// Instantiates and updates several Flight objects.

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class FlightTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Flight> flightList = new ArrayList<>();

        System.out.println("Welcome to the Flight Manager!");

        char addMore;

        do { 
            System.out.print("Enter the airline name: ");
            String airlineName = scan.nextLine().trim();

            System.out.print("Enter the flight number: ");
            String flightNumber = scan.nextLine().trim();

            System.out.print("Enter the departure city: ");
            String departureCity = scan.nextLine().trim();

            System.out.print("Enter the arrival city: ");
            String arrivalCity = scan.nextLine().trim();

            Flight flight = new Flight(airlineName, flightNumber, departureCity, arrivalCity);
            System.out.println("\nFlight added to your flight manager:");
            System.out.println(flight);
            flightList.add(flight);

            System.out.print("Would you like to add another flight? (y/n): ");
            addMore = scan.nextLine().trim().toLowerCase().charAt(0);
        } while (addMore == 'y');

        System.out.println("\nYou have added the following flights:");

        for (Flight myFlight : flightList) {
            System.out.println("\n" + myFlight);
        }

        System.out.println("\n Number of flights added: " + flightList.size());

        System.out.println("\n Thank you for using the Flight Manager!");
        scan.close();
    }
}