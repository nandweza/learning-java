//Computes the distance between coordinates of two points

import java.text.DecimalFormat;
import java.util.Scanner;

public class Distance {
    public static void main(String[] args){
        DecimalFormat df = new DecimalFormat("0.00");
        Scanner scan = new Scanner(System.in);

        double x1, x2, y1, y2;
        double distance;

        System.out.print("Enter x1: ");
        x1 = scan.nextDouble();

        System.out.print("Enter y1: ");
        y1 = scan.nextDouble();

        System.out.print("Enter x2: ");
        x2 = scan.nextDouble();

        System.out.print("Enter y2: ");
        y2 = scan.nextDouble();

        distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        System.out.println("Distance between two points is: " + df.format(distance));

        scan.close();
    }
}
