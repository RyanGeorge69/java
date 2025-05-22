package class10;
import java.util.*;
public class serise2
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,s=2;
        System.out.print("Enter the value of n:");
        n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            if(i%2==0)
            {
                s=s-i;
            }
            else
            {
                s=s+i;
            }
        }
        System.out.println("Ans is "+s);
    }
}
/**
 * n is the no. till the serise will work and calculate it 
 * s is the the sum of the serise till n
 * i is constant
 */
