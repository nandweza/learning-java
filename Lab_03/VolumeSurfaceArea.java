//Calcultes the volume and surface area of  a sphere

import java.text.DecimalFormat;
import java.util.Scanner;

public class VolumeSurfaceArea {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.0000");

        double r, volume, surfaceArea;

        System.out.print("Enter the radius: ");
        r = scan.nextDouble();

        volume = (4 * Math.PI * Math.pow(r, 3)) / 3;

        surfaceArea = 4 * Math.PI * Math.pow(r, 2);

        System.out.println("Volume of the sphere is: " + df.format(volume));
        System.out.println("Surface Area of the sphere is: " + df.format(surfaceArea));

        scan.close();
    }
}
