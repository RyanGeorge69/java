import java.util.*;
public class Factorial
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter a value:");
        int n=sc.nextInt();
        int t=n;
        int j=1,sum=0;      
        while(t>0)
        {
            int k=t%10;
            j=1;
            for(int i=1;i<=k;i++)
            j*=i;
            sum+=j;
            t=t/10;
        }
        if(sum==n)
        System.out.println("It is a special number");
        else
        System.out.println("It is not a special number");
    }
}
