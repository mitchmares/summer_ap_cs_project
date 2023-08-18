import java.util.Scanner;

/**
 * Task 2.4 - Ask the user for temperature
 * Name: Mitch
 * Date: 8/5/23
 * Program Title: Task 2.4 - Temperature Input
 * Program Description: This program asks the user to input a temperature and displays the entered temperature.
 * Variable List: temperature
 */
public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the temperature: ");
        double temperature = scanner.nextDouble();

        scanner.close();

        System.out.println("Entered temperature: " + temperature);
    }
}
