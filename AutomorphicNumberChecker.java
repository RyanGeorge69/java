package class10;
import java.util.Scanner;

public class AutomorphicNumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (isAutomorphicNumber(number)) {
            System.out.println(number + " is an automorphic number.");
        } else {
            System.out.println(number + " is not an automorphic number.");
        }

        scanner.close();
    }

    private static boolean isAutomorphicNumber(int num) {
        // Calculate the square of the number
        int square = num * num;

        // Find the number of digits in the original number
        int numDigits = (int) Math.log10(num) + 1;

        // Extract the last digits of the square equal to the number of digits in the original number
        int lastDigits = square % (int) Math.pow(10, numDigits);

        // Check if the extracted digits are equal to the original number
        return lastDigits == num;
    }
}
