import java.util.Scanner;

/**
 * Task 2.7 - Use % operator in calculations
 * Name: Mitch
 * Date: 8/5/23
 * Program Title: Task 2.7 - Calculations with Modulus
 * Program Description: This program performs calculations using the modulus operator (%).
 * Variable List: num1, num2, remainder
 */
public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        scanner.close();

        int remainder = num1 % num2;

        System.out.println("Remainder: " + remainder);
    }
}
