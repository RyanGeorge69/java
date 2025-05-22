package class10;
import java.util.Scanner;

public class NivenNumberChecker 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int sum = 0 ,p;
        p=number;
        while (number != 0) 
        {
            int digit = number % 10;
            sum += digit;
            number /= 10;
        }
        if (number/sum==0) 
        {
            System.out.println(p + " is a Niven number.");
        } 
        else 
        {
            System.out.println(p + " is not a Niven number.");
        }
    }

}
