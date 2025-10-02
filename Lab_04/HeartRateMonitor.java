import java.util.Scanner;

public class HeartRateMonitor {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        final int LOWER_BOUND_TARGET = 120;
        final int UPPER_BOUND_TARGET = 150;

        System.out.print("Enter the current heart rate: ");
        int heartRate = scan.nextInt();

        if ((heartRate <= UPPER_BOUND_TARGET) && (heartRate >= LOWER_BOUND_TARGET)){
            System.out.println("You're right on track!");
        } else if (heartRate < LOWER_BOUND_TARGET){
            System.out.println("You're doing great, but try to push it a bit!");
        }
        else {
            System.out.println("You're on fire! Slow down just a bit.");
        }

        scan.close();
    }
}
