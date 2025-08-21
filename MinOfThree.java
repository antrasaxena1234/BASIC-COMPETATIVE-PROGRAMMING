import java.util.Scanner;

public class MinOfThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input three numbers
        System.out.print("Enter number a: ");
        int a = scanner.nextInt();

        System.out.print("Enter number b: ");
        int b = scanner.nextInt();

        System.out.print("Enter number c: ");
        int c = scanner.nextInt();

        // Find minimum of a, b and c
        int min = a;

        if (b < min) {
            min = b;
        }

        if (c < min) {
            min = c;
        }

        // Print the minimum number
        System.out.println("The minimum number among " + a + ", " + b + ", and " + c + " is: " + min);

        scanner.close();
    }
}
