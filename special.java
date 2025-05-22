package class10;
import java.util.*;
public class special
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter a no.:");
        int n=sc.nextInt();
        int a=n;
        int f=1;
        int sum=0;
        while(a>0)
        {
            int k=a%10;
            f=1;
            for(int i=1;i<=k;i++)
            f*=i;
            sum+=f;
            a/=10;
        }
        if(sum==n)
        System.out.print("It is a special number");
        else
        System.out.print("It is not special number");
    }
}
