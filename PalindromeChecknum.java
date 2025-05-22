import java.util.Scanner;

public class PalindromeChecknum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (isPalindrome(number))
            System.out.println(number + " is a palindrome number.");
        else
            System.out.println(number + " is not a palindrome number.");

        scanner.close();
    }

    // Function to check whether a number is palindrome or not
    public static boolean isPalindrome(int number) {
        int reversedNumber = 0;
        int originalNumber = number;

        while (number != 0) {
            int remainder = number % 10;
            reversedNumber = reversedNumber * 10 + remainder;
            number = number / 10;
        }

        return originalNumber == reversedNumber;
    }
}
