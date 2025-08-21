import java.util.Scanner;

public class DivisibleBy5And11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input from the user
        System.out.print("Enter an integer: ");
        int a = scanner.nextInt();

        // Check divisibility by both 5 and 11
        if (a % 5 == 0 && a % 11 == 0) {
            System.out.println(a + " is divisible by both 5 and 11.");
        } else {
            System.out.println(a + " is NOT divisible by both 5 and 11.");
        }

        scanner.close();
    }
}
