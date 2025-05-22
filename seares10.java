import java.util.*;
import java.lang.*;
public class seares10
{
    public static void main()
    {
        double s=0;
        int n,a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no.");
        n=sc.nextInt();
        System.out.println("Enter a no.");
        a=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            s=s+Math.pow(a,i)/i;
        }
        System.out.println(s);
    }
}
