package class10;

import java.util.Scanner;

public class BinaryConverter {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter an integer: ");
        
        // Read the user input as an integer
        long number = scanner.nextLong();

        // Close the scanner
        scanner.close();

        // Convert the integer to binary and display it
        String binary = Long.toBinaryString(number);
        System.out.println("Binary equivalent: " + binary);
    }
}
