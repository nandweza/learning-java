import java.util.Scanner;

public class DiceRoller {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of sides: ");
        int sides = scan.nextInt();

        PairOfDice player = new PairOfDice(sides);
        PairOfDice computer = new PairOfDice(sides);

        int playerWins = 0;
        int computerWins = 0;
        int ties = 0;
        char again;

        do {
            player.roll();
            computer.roll();

            System.out.println("Your roll: " + player.toString());
            System.out.println("Computer's roll: " + computer.toString());

            if (player.getTotal() > computer.getTotal()) {
                System.out.println("You win!");
                playerWins++;
            } else if (player.getTotal() < computer.getTotal()) {
                System.out.println("You lose!");
                computerWins++;
            } else {
                System.out.println("It's a tie!");
                ties++;
            }

            System.out.println();
            System.out.println("Your wins: " + playerWins + "\t Computer's wins: " + computerWins +
                                "\t Ties: " + ties);

            System.out.println();

            System.out.println("Do you want to roll again? (Y)es to continue, anything to quit.");
            again = scan.next().toLowerCase().charAt(0);
        } while (again == 'y');

        System.out.println("Thanks for playing!");
        scan.close();
    }
}
