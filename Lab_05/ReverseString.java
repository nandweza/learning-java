import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String trimmedString = scan.nextLine().trim();

        System.out.println("Your string: " + trimmedString);

        int stringLength = trimmedString.length() - 1;

        for (int i = stringLength; i >= 0; i--) {
            System.out.print(trimmedString.charAt(i));
        }

        scan.close();
    }
}