package class10;
import java.util.*;

public class factorial
{
    private static double s=0;
    private static int n;
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter till what you want the program to run:");
        n=sc.nextInt();
        
        for(int a=1;a<=n;a++)
        {
            int f=1;
            for(int d=1;d<=a;d++)
            {
                f=f*d;
            }
            s=s+(double)1/f;
        }
        System.out.println(s);
    }
}
