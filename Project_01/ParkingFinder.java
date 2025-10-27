// ParkingFinder.java
//Randomly generates parking spots and finds the closest one to the user's car
//Also calculates the cost of parking based on user input

import java.util.Random;
import java.util.Scanner;
import java.text.NumberFormat;
import edu.cwi.parking.ParkingSpot;

public class ParkingFinder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        NumberFormat nf = NumberFormat.getCurrencyInstance();

        System.out.print("Enter your random seed: ");
        long randomSeed = scan.nextLong();

        Random generator = new Random(randomSeed);

        System.out.print("Enter the necessary parking time (minutes): ");
        int parkingTime = scan.nextInt();
        int roundedParkingTime = (int) Math.ceil(parkingTime / 10.0) * 10;
       
        final double DEFAULT_COST = 0.25;

        //generates random coordinates for the car
        int carX = generator.nextInt(100);
        int carY = generator.nextInt(100);

        System.out.println("The position of your vehicle is: X: " + carX + " Y: " + carY + "\n");

        //creates four parking spots with random locations
        ParkingSpot spot1 = new ParkingSpot("1st Main St", generator.nextInt(100), generator.nextInt(100));
        ParkingSpot spot2 = new ParkingSpot("2nd Main St", generator.nextInt(100), generator.nextInt(100));
        ParkingSpot spot3 = new ParkingSpot("3rd Main St", generator.nextInt(100), generator.nextInt(100));
        ParkingSpot spot4 = new ParkingSpot("4th Main St", generator.nextInt(100), generator.nextInt(100));

        //sets the cost per interval for each parking spot
        spot1.setCostPerInterval(DEFAULT_COST);
        spot2.setCostPerInterval(DEFAULT_COST);
        spot3.setCostPerInterval(0.30);
        spot4.setCostPerInterval(0.30);

        //calculates the distance from the car to each parking spot using manhattan geometry
        int distance1 = Math.abs(carX - spot1.getLocationX()) + Math.abs(carY - spot1.getLocationY());
        int distance2 = Math.abs(carX - spot2.getLocationX()) + Math.abs(carY - spot1.getLocationY());
        int distance3 = Math.abs(carX - spot3.getLocationX()) + Math.abs(carY - spot1.getLocationY());
        int distance4 = Math.abs(carX - spot4.getLocationX()) + Math.abs(carY - spot1.getLocationY());

        //calculates the total cost for parking at each spot
        double totalCost1 = spot1.getCostPerInterval() * (roundedParkingTime / 10.0);
        double totalCost2 = spot2.getCostPerInterval() * (roundedParkingTime / 10.0);
        double totalCost3 = spot3.getCostPerInterval() * (roundedParkingTime / 10.0);
        double totalCost4 = spot4.getCostPerInterval() * (roundedParkingTime / 10.0);

        //prints the details of each parking spot
        System.out.println("Spot 1: " + spot1 + "\n\t" + "Distance to spot1 is: " + distance1 + "\n\t" 
                            + "Total cost for spot 1 is: " + nf.format(totalCost1) + "\n");
        System.out.println("Spot 2: " + spot2 + "\n\t" + "Distance to spot2 is: " + distance2 + "\n\t" 
                            + "Total cost for spot 2 is: " + nf.format(totalCost2) + "\n");
        System.out.println("Spot 3: " + spot3 + "\n\t" + "Distance to spot3 is: " + distance3 + "\n\t" 
                            + "Total cost for spot 3 is: " + nf.format(totalCost3) + "\n");
        System.out.println("Spot 4: " + spot4 + "\n\t" + "Distance to spot4 is: " + distance4 + "\n\t" 
                            + "Total cost for spot 4 is: " + nf.format(totalCost4) + "\n");

        //determines the closest parking spot and prints its details
        if (distance1 <= distance2 && distance1 <= distance3 && distance1 <= distance4) {
            System.out.println("The distance to closest spot is: " + distance1);
            System.out.println("The closest spot is: " + spot1);
        } else if (distance2 <= distance1 && distance2 <= distance3 && distance2 <= distance4) {
            System.out.println("The distance to closest spot is: " + distance2);
            System.out.println("The closest spot is: " + spot2);
        } else if (distance3 <= distance1 && distance3 <= distance2 && distance3 <= distance4) {
            System.out.println("The distance to closest spot is: " + distance3);
            System.out.println("The closest spot is: " + spot3);
        } else {
            System.out.println("The distance to closest spot is: " + distance4);
            System.out.println("The closest spot is: " + spot4);
        }

        scan.close();

    }
}