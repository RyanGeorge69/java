package class10;
/**
 * s=1+1+2+3+5+8.... to n
 */
import java.util.Scanner;

public class serise1
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        
        long firstTerm = 1;
        long secondTerm = 1;
        long sum = 2;
        
        for (int i = 3; i <= n; i++) 
        {
            long nextTerm = firstTerm + secondTerm;
            sum += nextTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
        
        System.out.println("The sum of the series up to the " + n + "th term is: " + sum);
    }
}
