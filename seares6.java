import java.util.*;
import java.lang.*;
public class seares6
{
    public static void main()
    {
        int n,s=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how much you want the sum of ");
        n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            s=s+i;
        }
        System.out.println("The sum of 1 to "+n+" = "+s);
    }
}