import java.util.Scanner;
import java.lang.Math;

/**
 * Task 2.8 - Use the math class for pow and sqrt
 * Name: Mitch
 * Date: 8/5/23
 * Program Title: Task 2.8 - Math Class Functions
 * Program Description: This program uses the Math class to perform power and square root calculations.
 * Variable List: mainNum, raisingPower, resultPower, number, resultSqrt
 */
public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter main number: ");
        double mainNum = scanner.nextDouble();

        System.out.print("Enter number to raise power of main number: ");
        double raisingPower = scanner.nextDouble();

        System.out.print("Enter a number for square root calculation: ");
        double number = scanner.nextDouble();

        scanner.close();

        double resultPower = Math.pow(mainNum, raisingPower);
        double resultSqrt = Math.sqrt(number);

        System.out.println("Result of power calculation: " + resultPower);
        System.out.println("Square root of " + number + ": " + resultSqrt);
    }
}
