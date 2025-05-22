package class10;
import java.util.Scanner;

public class AutomorphicNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a number
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        // Check if the number is automorphic
        if (isAutomorphic(num)) {
            System.out.println(num + " is an automorphic number.");
        } else {
            System.out.println(num + " is not an automorphic number.");
        }

        scanner.close();
    }

    // Function to check if a number is automorphic
    static boolean isAutomorphic(int num) {
        int square = num * num;
        String numStr = String.valueOf(num);
        String squareStr = String.valueOf(square);

        // Check if the square ends with the same digits as the number
        return squareStr.endsWith(numStr);
    }
}
