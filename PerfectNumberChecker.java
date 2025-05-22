package class10;
import java.util.*;

public class PerfectNumberChecker 
{
    public static void main(String[] args) 
    {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i < number; i++) 
        {
            if (number % i == 0) 
            {
                sum += i;
            }
        }
        if (sum==number) 
        {
            System.out.println(number + " is a perfect number.");
        } 
        else 
        {
            System.out.println(number + " is not a perfect number.");
        }
    }

    /*public static boolean isPerfectNumber(int number) {
        int sumOfFactors = calculateSumOfFactors(number);
        return sumOfFactors == number;
    }

    public static int calculateSumOfFactors(int number) {
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum;
    }*/
}
