import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter percentage: ");
        double percentage = scanner.nextDouble();

        String grade;

        if (percentage < 0 || percentage > 100) {
            grade = "Invalid percentage!";
        } else if (percentage < 25) {
            grade = "D";
        } else if (percentage <= 45) {
            grade = "C";
        } else if (percentage <= 65) {
            grade = "B";
        } else if (percentage <= 85) {
            grade = "A";
        } else {
            grade = "A+";
        }

        System.out.println("Grade: " + grade);

        scanner.close();
    }
}
