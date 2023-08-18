import java.util.Scanner;

/**
 * Task 2.2 - Read 3 numbers into 3 different variables
 * Name: Mitch
 * Date: 8/5/23
 * Program Title: Task 2.2 - Reading 3 Numbers
 * Program Description: This program reads three numbers from the user and stores them in separate variables.
 * Variable List: num1, num2, num3
 */
public class Task2 {
    public static void main(String[] args) {
        // Scanner
        Scanner scanner = new Scanner(System.in);
        // Variables
        int num1, num2, num3;

        System.out.print("Enter the first number: ");
        num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        num2 = scanner.nextInt();

        System.out.print("Enter the third number: ");
        num3 = scanner.nextInt();

        scanner.close();

        System.out.println("Numbers entered: " + num1 + ", " + num2 + ", " + num3);
    }
}
