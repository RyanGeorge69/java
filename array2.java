package class10;
import java.util.*;
public class array2
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the till what no. of elements do you want:");
        int n=sc.nextInt();
        int a[]=new int[n];
        int s=0,p=0;
        for(int i=0;i<n;i++)
        {
            System.out.print("Enter a value:");
            a[i]=sc.nextInt();
        }
        for(int j=0;j<n;j++)
        {
            if(a[j]%2==0)
            {
                s+=a[j];
            }
            else
            {
                p+=a[j];
            }
        }
        
        System.out.println("The sum of all even no. is:"+s);
        System.out.println("The sum of all odd no. is:"+p);
    }
}
/**
 * Data type   value     ues 
 * int         s         used to find the sum of all even no.
 * int         p         used to find the sum of all odd no.
 * int         i and j   constat
 * int         n         no. of elements
 * int         a[]       array
 */
