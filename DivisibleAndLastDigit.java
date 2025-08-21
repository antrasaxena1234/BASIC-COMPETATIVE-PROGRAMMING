import java.util.Scanner;

public class DivisibleAndLastDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        
        if (num % 3 == 0 && num % 10 == 4) {
            System.out.println("The number is divisible by 3 and its last digit is 4.");
        } else {
            System.out.println("Condition not met.");
        }
    }
}