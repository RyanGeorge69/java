package class10;

import java.util.Scanner;

public class SmallestDigitFinder 
{
    public static void main(String[] args) 
    {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        int smallestDigit = 9;
        while (number > 0)
        {
            int digit = number % 10;

            if (digit < smallestDigit) 
            {
                smallestDigit = digit;
            }

            number=number/10;
        }
        System.out.println("Smallest digit is " + smallestDigit);
    }
}