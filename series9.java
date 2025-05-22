package class10;
import java.util.*;
public class series9
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        double a;
        double sum = 0.0;
        System.out.print("Enter till what no. do you want the program to work:");
        int n=sc.nextInt();
        System.out.print("Enter the value of A:");
        a=sc.nextDouble();
        for (int i = 1;i<= n;i++) 
        {
            sum += i /Math.pow(a,i);
        }

        System.out.println("Sum of the series: " + sum);
    }
}
