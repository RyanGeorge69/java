package class10;

import java.util.Scanner;

public class HappyNumber
{
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number to check: ");
        long num = in.nextLong();
        long sum = 0;
        long n = num;
        do 
        {
            sum = 0;
            while (n > 0) 
            {
                int d = (int)(n % 10);//n=31
                sum += d * d;
                n /= 10;//n=3,n=0
            }
            n = sum;
        } 
        while (sum > 6);

        if (sum == 1) {
            System.out.println(num + " is a Happy Number");
        }
        else {
            System.out.println(num + " is not a Happy Number");
        }
    }
}