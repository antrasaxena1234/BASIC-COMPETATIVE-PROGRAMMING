import java.util.Scanner;

public class ValidTriangleCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input three angles
        System.out.print("Enter angle a: ");
        int a = scanner.nextInt();

        System.out.print("Enter angle b: ");
        int b = scanner.nextInt();

        System.out.print("Enter angle c: ");
        int c = scanner.nextInt();

        // Check if the triangle is valid
        if (a > 0 && b > 0 && c > 0 && (a + b + c == 180)) {
            System.out.println("The triangle is valid.");
        } else {
            System.out.println("The triangle is NOT valid.");
        }

        scanner.close();
    }
}
