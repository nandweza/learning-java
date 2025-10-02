import java.util.Scanner;

public class RestaurantEvaluator {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        boolean hasFish, hasPizza, hasVegan;

        System.out.print("The restaurant has fish: ");
        hasFish = scan.nextBoolean();

        System.out.print("The restaurant has pizza: ");
        hasPizza = scan.nextBoolean();

        System.out.print("The restaurant has vegan: ");
        hasVegan = scan.nextBoolean();

        System.out.println(((hasFish || hasPizza) && hasVegan) ? "Let's go!" :
                             "Sorry, we'll have to think of somewhere else.");

        scan.close();
    }
}
