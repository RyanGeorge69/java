import java.util.*;
import java.lang.*;
public class seares4
{
    public static void main()
    {
        int a,x=1,n;
        double s=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        a=sc.nextInt();
        System.out.println("Enter a numder for how much you want to multiplay ");
        n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            s=s+Math.pow(a,i)/x;
            x=x+4;
        }
        System.out.println(s);
    }
}
