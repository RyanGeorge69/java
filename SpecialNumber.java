import java.util.Scanner;

public class SpecialNumber {

    // Function to calculate factorial of a number
    public static int factorial(int n) {
        if (n == 0)
            return 1;
        return n * factorial(n - 1);
    }

    // Function to check if a number is a special number or not
    public static boolean isSpecialNumber(int num) {
        int originalNum = num;
        int sumOfFactorials = 0;

        // Calculate sum of factorials of digits
        while (num != 0) {
            int digit = num % 10;
            sumOfFactorials += factorial(digit);
            num /= 10;
        }

        // Check if sum of factorials equals original number
        return sumOfFactorials == originalNum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        if (isSpecialNumber(num)) {
            System.out.println(num + " is a special number.");
        } else {
            System.out.println(num + " is not a special number.");
        }
        scanner.close();
    }
}
