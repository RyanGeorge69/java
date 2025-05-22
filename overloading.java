package class10;
import java.util.*;
public class overloading
{
    Scanner sc=new Scanner(System.in);
    void hello()
    {
        System.out.print("Enter a no.:");
        int k=sc.nextInt();
        int a=k;
        int n=0,sum=0;
        while(a>0)
        {
            n=a%10;
            sum+=n;
            a=a/10;
        }
        int f=sum*sum*sum;
        if(f==k)
        System.out.print("It is a Dudeney numder");
        else
        System.out.print("It is not a Dudeney numder");
            
        
    }

    void hello(int n)
    {
        int k=1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(k+" ");
                k++;
            }
            System.out.println();

        }
    }

    public static void main()
    {
        Scanner a=new Scanner(System.in);
        System.out.print("Enter 1 to check Dudeney no.\n      2 for a pattern ");
        int no=a.nextInt();
        overloading ob=new overloading();
        if(no==1)
            ob.hello();
        else
        {   System.out.print("Enter the no. of rows:");
            int q=a.nextInt();
            ob.hello(q);
        }
    }
}