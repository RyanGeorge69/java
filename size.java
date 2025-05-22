import java.util.*;
public class size
{
    public static void main()
    {
        int a[]=new int[10];
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter 10 values:");
        for(int i=0;i<10;i++)
            a[i]=sc.nextInt();
        int sum1=0,sum2=0;
        for(int i=0;i<10;i++)
        {
            if(a[i]<=9 && a[i]>=0)      
            sum1+=a[i];
            if(a[i]>9 && a[i]<100)
            sum2+=a[i];
        }
        System.out.println("Sum of only single Digit "+sum1);
        System.out.println("Sum of only Double Digit "+sum2);
    }
}