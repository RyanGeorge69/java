package exam;

public class SpecialNumber {
    
    // Function to calculate factorial of a number
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
    
    // Function to check if a number is a special number
    public static boolean isSpecialNumber(int num) {
        int sum = 0;
        int originalNum = num;
        
        // Calculate the sum of factorials of each digit
        while (num > 0) {
            int digit = num % 10;
            sum += factorial(digit);
            num /= 10;
        }
        
        // Check if the sum is equal to the original number
        return sum == originalNum;
    }
    
    public static void main(String[] args) {
        int number = 145;
        if (isSpecialNumber(number)) {
            System.out.println(number + " is a special number.");
        } else {
            System.out.println(number + " is not a special number.");
        }
    }
}
