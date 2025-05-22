package exam;
import java.util.*;
public class seires
{
    double s=0;
    public void pattSrries()
    {
        int a=1,b=3,n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a value for n ");
        n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            s=s+a/b;
            a++;
            b++;
        }
    }
    public static void main()
    {
        double r=0,s=r;
        seires ob1=new seires();
        ob1.pattSrries();
        System.out.println(r);
    }
}
/*
 * public static void main()
    {
        System.out.println("welcome to car dealer");
        car ob1=new car();
        ob1.usage();
    }
    
 */