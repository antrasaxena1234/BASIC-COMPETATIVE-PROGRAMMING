import java.util.Scanner;

public class AverageOf5Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input 5 numbers
        System.out.print("Enter number a: ");
        double a = scanner.nextDouble();

        System.out.print("Enter number b: ");
        double b = scanner.nextDouble();

        System.out.print("Enter number c: ");
        double c = scanner.nextDouble();

        System.out.print("Enter number d: ");
        double d = scanner.nextDouble();

        System.out.print("Enter number e: ");
        double e = scanner.nextDouble();

        // Calculate average
        double average = (a + b + c + d + e) / 5;

        // Display result
        System.out.println("The average of the 5 numbers is: " + average);

        scanner.close();
    }
}
