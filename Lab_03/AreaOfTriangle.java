//computes the area of the trianle using Heron's formula

import java.text.DecimalFormat;
import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.000");

        double a, b, c;

        System.out.print("Enter length a: ");
        a = scan.nextDouble();

        System.out.print("Enter length b: ");
        b = scan.nextDouble();

        System.out.print("Enter length c: ");
        c = scan.nextDouble();

        double s = (a + b + c) / 2;

        double area = Math.sqrt((s) * (s - a) * (s - b) * (s - c));

        System.out.println("Area of the trianlge is: " + df.format(area));

        scan.close();
    }
}
