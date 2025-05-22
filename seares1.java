import java.util.*;
import java.lang.*;
public class seares1
{
    public static void main()
    {
        int n,s=0,a;
        int x=1;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("What numder do you want to use as 'a' ");
        a=sc.nextInt();
        System.out.println("Till what number do you want add");
        n=sc.nextInt();

        for(int i=1;i<=n;i++)
        {
        
            s=s+(int)(Math.pow(a,i))/x;
            x=x+4;
        }
        System.out.println(s);
    }
}
