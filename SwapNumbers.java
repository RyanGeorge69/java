package class10;

import java.util.Scanner;

public class SwapNumbers 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int number1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int number2 = scanner.nextInt();
        number1 = number1 + number2;//1=12 2=13 ==25
        number2 = number1 - number2;//25-13 ==12
        number1 = number1 - number2;//25-12 ==13

        System.out.println("After swapping:");
        System.out.println("First number: " + number1);
        System.out.println("Second number: " + number2);
    }
}

