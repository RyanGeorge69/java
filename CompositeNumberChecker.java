package class10;

import java.util.Scanner;

public class CompositeNumberChecker 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number%2==0) 
        {
            System.out.println(number + " it is a composite number.");
        } 
        else 
        {
            System.out.println(number + " is not a composite number.");
            
        }
    }
}
