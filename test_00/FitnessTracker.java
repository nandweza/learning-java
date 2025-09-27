// A simple fitness tracker program that collects user data and calculates total and average steps.

import java.util.Scanner;

public class FitnessTracker {
    public static void main(String[] args) {
        final int DAILY_STEP_GOAL;
        int stepsInFirstRound;
        int stepsInSecondRound;
        String name;
        int age;

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your name: ");
        name = scan.nextLine();

        // Scanner scan2 = new Scanner(System.in);
        System.out.print("Enter your age: ");
        age = scan.nextInt();

        System.out.print("Enter your daily step goal: ");
        DAILY_STEP_GOAL = scan.nextInt();

        System.out.print("Enter steps taken in first round: ");
        stepsInFirstRound = scan.nextInt();

        System.out.print("Enter steps taken in second round: ");
        stepsInSecondRound = scan.nextInt();

        int totalSteps = stepsInFirstRound + stepsInSecondRound;
        float averageSteps = totalSteps / DAILY_STEP_GOAL;

        System.out.println("Name: " + name + ", Age: " + age);
        System.out.println("Total Steps: " + totalSteps);
        System.out.println("Average Steps (as a fraction of goal): " + averageSteps);

        scan.close();

    }
}