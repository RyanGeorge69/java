package class10;
import java.util.Scanner;

public class TwistedPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        if (isTwistedPrime(number)) {
            System.out.println(number + " is a Twisted Prime number.");
        } else {
            System.out.println(number + " is not a Twisted Prime number.");
        }
    }
    
    public static boolean isTwistedPrime(int number) {
        if (isPrime(number)) {
            int reversedNumber = reverseNumber(number);
            return isPrime(reversedNumber);
        }
        
        return false;
    }
    
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        
        return true;
    }
    
    public static int reverseNumber(int number) {
        int reversedNumber = 0;
        
        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }
        
        return reversedNumber;
    }
}
