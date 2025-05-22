import java.util.*;
import java.lang.*;
public class seares8
{
    public static void main()
    {
        double s=0;
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no. till what you want the sum of 1/the no. ");
        n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            s=s+1.0/i;
        }
        System.out.println(s);
    }
}
