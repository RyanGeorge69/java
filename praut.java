package class10;
import java.util.*;
public class praut
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a no. ");
        int number=sc.nextInt();
        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
        if (isAutomorphic(number)) {
            System.out.println(number + " is an automorphic number.");
        } else {
            System.out.println(number + " is not an automorphic number.");
        }
    }

    public static boolean isPrime(int num) 
    {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isAutomorphic(int num) {
        int square = num * num;
        String numStr = String.valueOf(num);
        String squareStr = String.valueOf(square);

        // Check if the square ends with the same digits as the original number
        return squareStr.endsWith(numStr);
    }
}

