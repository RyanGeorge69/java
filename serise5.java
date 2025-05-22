package class10;
import java.util.*;
/**
 * pg no.=124
 */
public class serise5
{
    private static double s=0,f=1;
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of n:");
        int n=sc.nextInt();
        for(int i =1;i<=n;i++)
        {
            s=s+(s+i)/(f*i);
        }
        System.out.println(s);
    }
}
