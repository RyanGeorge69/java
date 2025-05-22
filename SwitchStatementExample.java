package class10;

import java.util.Scanner;

public class SwitchStatementExample 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Menu:");
        System.out.println("Option 1=to find if it is a composit no.");
        System.out.println("Option 2=to find the smallest no.");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        switch (choice) 
        {
            case 1:
                System.out.print("Enter a number: ");
                int number = scanner.nextInt();

                if (number%2==0) 
                {
                    System.out.println(number + " it is a composite number.");
                } else {
                    System.out.println(number + " is not a composite number.");

                }
                break;
            case 2:
                System.out.print("Enter an integer: ");
                int numbers= scanner.nextInt();

                int smallestDigit = 9;
                while (numbers > 0) 
                {
                    int digit = numbers % 10;//103.1

                    if (digit < smallestDigit) 
                    {
                        smallestDigit = digit;//103
                    }

                    numbers=numbers/10;
                }
                System.out.println("Smallest digit is " + smallestDigit);
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
    }
}
