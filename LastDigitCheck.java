import java.util.Scanner;

public class LastDigitCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for input
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Get the last digit (handle negative numbers too)
        int lastDigit = Math.abs(number) % 10;

        // Check if the last digit is 4
        if (lastDigit == 4) {
            System.out.println("The last digit is 4.");
        } else {
            System.out.println("The last digit is not 4.");
        }

        scanner.close();
    }
}
