import java.util.Scanner;

public class TriangleTypeByAngles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input three angles
        System.out.print("Enter first angle: ");
        int angle1 = scanner.nextInt();

        System.out.print("Enter second angle: ");
        int angle2 = scanner.nextInt();

        System.out.print("Enter third angle: ");
        int angle3 = scanner.nextInt();

        int sum = angle1 + angle2 + angle3;

        // Check if it's a valid triangle
        if (sum != 180 || angle1 <= 0 || angle2 <= 0 || angle3 <= 0) {
            System.out.println("The angles do not form a valid triangle.");
        } else {
            // Determine the type of triangle
            if (angle1 == 90 || angle2 == 90 || angle3 == 90) {
                System.out.println("It is a Right-angled triangle.");
            } else if (angle1 > 90 || angle2 > 90 || angle3 > 90) {
                System.out.println("It is an Obtuse-angled triangle.");
            } else {
                System.out.println("It is an Acute-angled triangle.");
            }
        }

        scanner.close();
    }
}
