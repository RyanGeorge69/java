package class10;
import java.util.Scanner;
//ii
public class SpecialNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (isSpecialNumber(number)) 
        {
            System.out.println(number + " is a special number.");
        } 
        else 
        {
            System.out.println(number + " is not a special number.");
        }
    }

    static boolean isSpecialNumber(int number) 
    {
        int originalNumber = number;
        int sum = 0;

        while (number != 0) 
        {
            int digit = number % 10;
            sum += factorial(digit);
            number /= 10;
        }

        return (sum == originalNumber);
    }
    static int factorial(int number) 
    {
        int result = 1;

        for (int i = 2; i <= number; i++) 
        {
            result *= i;
        }

        return result;
    }
}
