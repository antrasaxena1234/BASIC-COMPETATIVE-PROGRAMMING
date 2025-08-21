import java.util.Scanner;

public class MaxOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input three integers
        System.out.print("Enter first number: ");
        int a = scanner.nextInt();

        System.out.print("Enter second number: ");
        int b = scanner.nextInt();

        System.out.print("Enter third number: ");
        int c = scanner.nextInt();

        // Find the maximum
        int max = a;

        if (b > max) {
            max = b;
        }

        if (c > max) {
            max = c;
        }

        // Print the maximum
        System.out.println("The maximum number is: " + max);

        scanner.close();
    }
}

