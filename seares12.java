import java.util.*;
import java.lang.*;
public class seares12
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
            if(i%2==0)
            {
                s=s-Math.pow(a,i)/i;
            }
            else
            {
                s=s+Math.pow(a,i)/i;
            }
        }
        System.out.println(s);
    }
}
