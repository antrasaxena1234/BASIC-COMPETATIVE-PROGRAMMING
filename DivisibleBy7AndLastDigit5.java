import java.util.Scanner;

public class DivisibleBy7AndLastDigit5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for input
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if number is divisible by 7
        boolean divisibleBy7 = number % 7 == 0;

        // Get last digit (handle negative numbers)
        int lastDigit = Math.abs(number) % 10;
        boolean lastDigitIs5 = lastDigit == 5;

        // Display results
        if (divisibleBy7 && lastDigitIs5) {
            System.out.println(number + " is divisible by 7 and ends with 5.");
        } else if (divisibleBy7) {
            System.out.println(number + " is divisible by 7 but does not end with 5.");
        } else if (lastDigitIs5) {
            System.out.println(number + " ends with 5 but is not divisible by 7.");
        } else {
            System.out.println(number + " is neither divisible by 7 nor ends with 5.");
        }

        scanner.close();
    }
}
