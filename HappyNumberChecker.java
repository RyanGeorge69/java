package class10;
import java.util.Scanner;

public class HappyNumberChecker 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int number = scanner.nextInt();
        int p = number;
        while (number != 1 && number != 4)
        {
            int sum = 0;
            while (number > 0) 
            {
                int digit = number % 10;
                sum += digit * digit;
                number /= 10;
            }
            number = sum;
        }

        if (number==1) 
        {
            System.out.println(p + " is a Happy Number.");
        } 
        else 
        {
            System.out.println(p + " is not a Happy Number.");
        }
    }


}
