package exam;
import java.util.Scanner;

public class FactorFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input from the user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Call the findFactors method and display the result
        System.out.println("Factors of " + number + ": ");
        findFactors(number);

        // Close the scanner
        scanner.close();
    }

    // Function to find and print the factors of a number
    private static void findFactors(int number) {
        // Iterate through potential factors from 1 to the number itself
        for (int i = 1; i <= number; i++) {
            // Check if i is a factor of the number
            if (number % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
    