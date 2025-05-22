import java.util.*;
public class Fibonacci_series
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the length of the array:");
        int n=sc.nextInt();
        int fib[]=new int[n];
        fib[0]=0;
        fib[1]=1;
        for(int i=2;i<n;i++)
        {
            fib[i]=fib[i-1]+fib[i-2];
        }
        for(int i=0;i<n;i++)
        System.out.print(fib[i]+",");
    }
}
