import java.util.Scanner;

public class FitnessTracker {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        final int DAILY_STEP_GOAL = 10000;

        System.out.print("Enter the number of steps taken today: ");
        int numberOfSteps = scan.nextInt();

        if (numberOfSteps < (DAILY_STEP_GOAL * 0.1)){
            System.out.println("Way to get a good start today!");
        } else if (numberOfSteps < DAILY_STEP_GOAL / 2){
            System.out.println("You're almosst halfway there!");
        } 
        else {
            System.out.println("You're over halfway there!");
        }
        scan.close();

    }
}
