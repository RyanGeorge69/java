import java.util.*;
import java.lang.*;
public class searec7
{
    public static void main()
    {
        int n,s=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. till how much you want the sum of if the even no. is substracatd");
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
        System.out.println("The sum of 1 to "+n+" if the even no. is substracatd = "+s);
    }
}