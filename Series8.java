package class10;
import java.util.*;
public class Series8 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        double a; // Change the value of 'a' to your desired value
        double sum = 0.0;
        System.out.print("Enter the value of A:");
        a=sc.nextDouble();
        for (int denominator = 2;denominator <= 20;) 
        {
            sum += a / denominator;
            denominator += 3; // Increment by 3 to get the next denominator
        }

        System.out.println("Sum of the series: " + sum);
    }
}
