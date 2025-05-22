package class10;
import java.util.Scanner;

public class HarshadNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        if (isHarshadNumber(number)) {
            System.out.println(number + " is a Harshad number.");
        } else {
            System.out.println(number + " is not a Harshad number.");
        }
    }
    
    public static boolean isHarshadNumber(int number) {
        int sumOfDigits = calculateSumOfDigits(number);
        
        return number % sumOfDigits == 0;
    }
    
    public static int calculateSumOfDigits(int number) {
        int sum = 0;
        
        while (number > 0) {
            int digit = number % 10;
            sum += digit;
            number /= 10;
        }
        
        return sum;
    }
}
