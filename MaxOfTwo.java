import java.util.Scanner;

public class MaxOfTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter number a: ");
        int a = scanner.nextInt();

        System.out.print("Enter number b: ");
        int b = scanner.nextInt();

        // Find maximum of a and b
        int max = (a > b) ? a : b;

        // Print the maximum number
        System.out.println("The maximum number between " + a + " and " + b + " is: " + max);

        scanner.close();
    }
}
