package exam;
import java.util.Scanner;

public class KboatValidNum
{

    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = in.nextInt();
        int n = num;

        while (n > 9) {
            int sum = 0;
            while (n != 0) {
                int d = n % 10;
                n /= 10;
                sum += d;
            }
            n = sum;
        }

        if (n == 1)
            System.out.println(num + " is Valid Number");
        else
            System.out.println(num + " is not Valid Number");

    }
}