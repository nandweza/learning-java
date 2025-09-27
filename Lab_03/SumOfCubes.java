//Prints the sum of two cubes raised to the third power

import java.util.Scanner;

public class SumOfCubes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int sumOfCubes, num1, num2;

        System.out.print("Enter num1: ");
        num1 = scan.nextInt();

        System.out.print("Enter num2: ");
        num2 = scan.nextInt();

        int num1Cube = (int) Math.pow(num1, 3);
        int num2Cube = (int) Math.pow(num2, 3);

        sumOfCubes = num1Cube + num2Cube;

        System.out.println("Sum of Cubes: " + sumOfCubes);

        scan.close();
    }
}
