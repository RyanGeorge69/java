import java.util.*;
import java.lang.*;
public class seares3
{
    public static void main()
    {
        int f=1,n,x;
        double s=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        x=sc.nextInt();
        System.out.println("how many times do you want to multiply");
        n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            f=1;
            for(int j=1;j<=i;j++)
            {
                f=f*j;
            }
            s=s+Math.pow(x,i)/f;
        }
        System.out.println(s);
    }
}