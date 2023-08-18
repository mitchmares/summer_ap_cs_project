/**
 * Task 2.3 - Perform calculations and output results
 * Name: Mitch
 * Date: 8/5/23
 * Program Title: Task 2.3 - Calculations and Outputs
 * Program Description: This program performs calculations on two numbers and outputs the results.
 * Variable List: a, b, quotient, remainder, result
 */
public class Task3 {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;

        int quotient = a / b;
        int remainder = a % b;
        double result = Math.pow(a, b);

        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);
        System.out.println("Result: " + result);
    }
}
