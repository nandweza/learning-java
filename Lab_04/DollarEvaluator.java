import java.util.Scanner;

public class DollarEvaluator{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number of dollars: ");
        int dollarNumber = scan.nextInt();

        if (dollarNumber == 0) {
            System.out.println("Sorry kid. You're broke!");
        }

        else if (dollarNumber < 100){
            System.out.println("Looks to me like you're rich!");
        } 
        else {
            
            System.out.println("You've got some spending money!");
        }

        scan.close();
    }
}